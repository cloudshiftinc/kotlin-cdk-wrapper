@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.CorsOptions
import software.amazon.awscdk.services.apigateway.IResource
import software.amazon.awscdk.services.apigateway.Integration
import software.amazon.awscdk.services.apigateway.MethodOptions
import software.amazon.awscdk.services.apigateway.Resource
import software.constructs.Construct

/**
 * Example:
 *
 * ```
 * LambdaIntegration booksBackend;
 * RestApi api = RestApi.Builder.create(this, "books")
 * .defaultIntegration(booksBackend)
 * .build();
 * Resource books = api.root.addResource("books");
 * books.addMethod("GET"); // integrated with `booksBackend`
 * books.addMethod("POST"); // integrated with `booksBackend`
 * Resource book = books.addResource("{book_id}");
 * book.addMethod("GET");
 * ```
 */
@CdkDslMarker
public class ResourceDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: Resource.Builder = Resource.Builder.create(scope, id)

  /**
   * Adds a CORS preflight OPTIONS method to this resource and all child resources.
   *
   * You can add CORS at the resource-level using `addCorsPreflight`.
   *
   * Default: - CORS is disabled
   *
   * @param defaultCorsPreflightOptions Adds a CORS preflight OPTIONS method to this resource and
   * all child resources. 
   */
  public fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptionsDsl.() -> Unit =
      {}) {
    val builder = CorsOptionsDsl()
    builder.apply(defaultCorsPreflightOptions)
    cdkBuilder.defaultCorsPreflightOptions(builder.build())
  }

  /**
   * Adds a CORS preflight OPTIONS method to this resource and all child resources.
   *
   * You can add CORS at the resource-level using `addCorsPreflight`.
   *
   * Default: - CORS is disabled
   *
   * @param defaultCorsPreflightOptions Adds a CORS preflight OPTIONS method to this resource and
   * all child resources. 
   */
  public fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions) {
    cdkBuilder.defaultCorsPreflightOptions(defaultCorsPreflightOptions)
  }

  /**
   * An integration to use as a default for all methods created within this API unless an
   * integration is specified.
   *
   * Default: - Inherited from parent.
   *
   * @param defaultIntegration An integration to use as a default for all methods created within
   * this API unless an integration is specified. 
   */
  public fun defaultIntegration(defaultIntegration: IntegrationDsl.() -> Unit = {}) {
    val builder = IntegrationDsl()
    builder.apply(defaultIntegration)
    cdkBuilder.defaultIntegration(builder.build())
  }

  /**
   * An integration to use as a default for all methods created within this API unless an
   * integration is specified.
   *
   * Default: - Inherited from parent.
   *
   * @param defaultIntegration An integration to use as a default for all methods created within
   * this API unless an integration is specified. 
   */
  public fun defaultIntegration(defaultIntegration: Integration) {
    cdkBuilder.defaultIntegration(defaultIntegration)
  }

  /**
   * Method options to use as a default for all methods created within this API unless custom
   * options are specified.
   *
   * Default: - Inherited from parent.
   *
   * @param defaultMethodOptions Method options to use as a default for all methods created within
   * this API unless custom options are specified. 
   */
  public fun defaultMethodOptions(defaultMethodOptions: MethodOptionsDsl.() -> Unit = {}) {
    val builder = MethodOptionsDsl()
    builder.apply(defaultMethodOptions)
    cdkBuilder.defaultMethodOptions(builder.build())
  }

  /**
   * Method options to use as a default for all methods created within this API unless custom
   * options are specified.
   *
   * Default: - Inherited from parent.
   *
   * @param defaultMethodOptions Method options to use as a default for all methods created within
   * this API unless custom options are specified. 
   */
  public fun defaultMethodOptions(defaultMethodOptions: MethodOptions) {
    cdkBuilder.defaultMethodOptions(defaultMethodOptions)
  }

  /**
   * The parent resource of this resource.
   *
   * You can either pass another
   * `Resource` object or a `RestApi` object here.
   *
   * @param parent The parent resource of this resource. 
   */
  public fun parent(parent: IResource) {
    cdkBuilder.parent(parent)
  }

  /**
   * A path name for the resource.
   *
   * @param pathPart A path name for the resource. 
   */
  public fun pathPart(pathPart: String) {
    cdkBuilder.pathPart(pathPart)
  }

  public fun build(): Resource = cdkBuilder.build()
}
