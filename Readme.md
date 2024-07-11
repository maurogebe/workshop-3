Integrantes: 
+ Mariana Saldarriaga maria.antonieta613@gmail.com
+ Stefani Torres stefanigtorres@gmail.com

Conclusión

Para nuestro ejercicio de Workshop se requería construir una aplicación de comercio que le permitiera a una tienda vender varios productos. Esta, tenía la particularidad de calcular el precio de venta de acuerdo a un SKU (referencia-codificador) y de manejar un carrito de compras que permitiera agregar o eliminar un producto, y hacer un seguimiento de los productos seleccionados.

Teniendo en cuenta este contexto, elegimos utilizar el método Strategy, ya que nos permite crear en la actualidad y en el futuro diferentes estrategias para el cálculo requerido en las ventas del comercio. De esta forma, la aplicación permite realizar subtareas de acuerdo a la particularidad del producto ingresado para la venta. 

Además de lo anterior mencionado, el método nos plantea las siguientes ventajas:
- Se pueden adicionar diferentes estrategias de cálculo.
- Cada estrategia se puede ejecutar y probar de forma independiente. De esta forma, es más fácil corregir los errores.
- El cálculo de precios no interfiere con las otras funcionalidades de la aplicación. Como por ejemplo: agregar productos a la tienda.
- Las estrategias pueden ser reutilizadas en diferentes partes de nuestro código. 
