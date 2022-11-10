#include <stdio.h>
  #include <stdlib.h>

  struct node 
  {
        int data;
        struct node *left, *right;
  };

  struct tnode *root = NULL;

  /* creating node of the tree  and fill the given data */
  struct node * createNode(int data) {
        struct node *newNode;
        newNode  = (struct node *) malloc(sizeof(struct node));
        newNode->data = data;
        newNode->left = NULL;
        newNode->right = NULL;
        return (newNode);
  }

  /* inserting a new node into the tree */
  void insertion(struct node **node, int data) {
        if (!*node) {
                *node = createNode(data);
        } else if (data < (*node)->data) {
                insertion(&(*node)->left, data);
        } else if (data > (*node)->data) {
                insertion(&(*node)->right, data);
        }
  }

  /* post order tree traversal */
  void postOrder(struct node *node) {
        if (node) {
                postOrder(node->left);
                postOrder(node->right);
                printf("%d  ", node->data);
        }
        return;
  }

  /* pre order tree traversal */
  void preOrder(struct node *node) {
        if (node) {
                printf("%d  ", node->data);
                preOrder(node->left);
                preOrder(node->right);
        }
        return;
  }

  /* inorder tree traversal */
  void inOrder(struct node *node) {
        if (node) {
                inOrder(node->left);
                printf("%d  ", node->data);
                inOrder(node->right);
        }
        return;
  }

  int main() {
        int data, ch;
        while (1) 
        {
                printf("\n1. Insertion\n2. Pre-order\n");
                printf("3. Post-order\n4. In-order\n");
                printf("5. Exit\nEnter your choice:");
                scanf("%d", &ch);
                switch (ch) 
                {
                        case 1:
                                printf("Enter ur data:");
                                scanf("%d", &data);
                                insertion(&root, data);
                                break;
                        case 2:
                                preOrder(root);
                                break;
                        case 3:
                                postOrder(root);
                                break;
                        case 4:
                                inOrder(root);
                                break;
                        case 5:
                                exit(0);
                        default:
                                printf("U've entered wrong opetion\n");
                                break;
                }
        }
        return 0;
  }
