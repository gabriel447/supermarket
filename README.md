# supermarket
supermarket java crud api rest

```mermaid
erDiagram
  PRODUCT ||--o{ SALE : "has"
  SELLER ||--o{ SALE : "makes"
  CUSTOMER ||--o{ SALE : "buys"
  PRODUCT {
      id int 
      name string 
      price double 
      quantity int 
  }
  SELLER {
      id int 
      name string 
      code int 
  }
  CUSTOMER {
      id int 
      name string 
      cpf string 
      balance double 
  }
  SALE {
      id int 
      date date 
      seller_code int 
      customer_cpf string 
      total_value double 
  }
