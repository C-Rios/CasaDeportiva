# *Backend - MinTic Ciclo 4*

## Juan Camilo De Los Ríos
### ***Models***

**Product**
* *ID*
* *Categoria*
* *Nombre*
* *Descripcion*
* *Precio*
* *Disponible*
* *Stock*
* *ImgRoute*

### ***EndPoints***
* `*/api/v1/product/all` → **[GET]** → Requests to get the products saved
* `*/api/v1/product/save` → **[POST]** → Requests to save a product 
* `*/api/v1/product/update` → **[PUT]** → Requests to updates a given product
* `*/api/v1/product/{id}` → **[DELETE]** → Requests to delete a product by his Id
* `*/api/v1/product/{id}` → **[GET]** → Requests to get a given product by his Id
* `*/api/v1/product/lte/{precio}` → **[GET]** → Request all the products that have a price less than or equal to a threshold
* `*/api/v1/product/category/{category}` → **[GET]** → Request all the products that have a specific category
* `*/api/v1/product/category/all` → **[GET]** → Request all the different categories
* `*/api/v1/product/searchByName/{name}` → **[GET]** → Request all the products that match their name with a given String 
