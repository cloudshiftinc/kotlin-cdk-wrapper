@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnDocumentationPart`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigateway.*;
 * CfnDocumentationPartProps cfnDocumentationPartProps = CfnDocumentationPartProps.builder()
 * .location(LocationProperty.builder()
 * .method("method")
 * .name("name")
 * .path("path")
 * .statusCode("statusCode")
 * .type("type")
 * .build())
 * .properties("properties")
 * .restApiId("restApiId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationpart.html)
 */
public interface CfnDocumentationPartProps {
  /**
   * The location of the targeted API entity of the to-be-created documentation part.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationpart.html#cfn-apigateway-documentationpart-location)
   */
  public fun location(): Any

  /**
   * The new documentation content map of the targeted API entity.
   *
   * Enclosed key-value pairs are API-specific, but only OpenAPI-compliant key-value pairs can be
   * exported and, hence, published.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationpart.html#cfn-apigateway-documentationpart-properties)
   */
  public fun properties(): String

  /**
   * The string identifier of the associated RestApi.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationpart.html#cfn-apigateway-documentationpart-restapiid)
   */
  public fun restApiId(): String

  /**
   * A builder for [CfnDocumentationPartProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param location The location of the targeted API entity of the to-be-created documentation
     * part. 
     */
    public fun location(location: IResolvable)

    /**
     * @param location The location of the targeted API entity of the to-be-created documentation
     * part. 
     */
    public fun location(location: CfnDocumentationPart.LocationProperty)

    /**
     * @param location The location of the targeted API entity of the to-be-created documentation
     * part. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d8532e46812d07871c382139cb8414ff9676bf02260a3a5f353269301a02bbbc")
    public fun location(location: CfnDocumentationPart.LocationProperty.Builder.() -> Unit)

    /**
     * @param properties The new documentation content map of the targeted API entity. 
     * Enclosed key-value pairs are API-specific, but only OpenAPI-compliant key-value pairs can be
     * exported and, hence, published.
     */
    public fun properties(properties: String)

    /**
     * @param restApiId The string identifier of the associated RestApi. 
     */
    public fun restApiId(restApiId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigateway.CfnDocumentationPartProps.Builder =
        software.amazon.awscdk.services.apigateway.CfnDocumentationPartProps.builder()

    /**
     * @param location The location of the targeted API entity of the to-be-created documentation
     * part. 
     */
    override fun location(location: IResolvable) {
      cdkBuilder.location(location.let(IResolvable::unwrap))
    }

    /**
     * @param location The location of the targeted API entity of the to-be-created documentation
     * part. 
     */
    override fun location(location: CfnDocumentationPart.LocationProperty) {
      cdkBuilder.location(location.let(CfnDocumentationPart.LocationProperty::unwrap))
    }

    /**
     * @param location The location of the targeted API entity of the to-be-created documentation
     * part. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d8532e46812d07871c382139cb8414ff9676bf02260a3a5f353269301a02bbbc")
    override fun location(location: CfnDocumentationPart.LocationProperty.Builder.() -> Unit): Unit
        = location(CfnDocumentationPart.LocationProperty(location))

    /**
     * @param properties The new documentation content map of the targeted API entity. 
     * Enclosed key-value pairs are API-specific, but only OpenAPI-compliant key-value pairs can be
     * exported and, hence, published.
     */
    override fun properties(properties: String) {
      cdkBuilder.properties(properties)
    }

    /**
     * @param restApiId The string identifier of the associated RestApi. 
     */
    override fun restApiId(restApiId: String) {
      cdkBuilder.restApiId(restApiId)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.CfnDocumentationPartProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.CfnDocumentationPartProps,
  ) : CdkObject(cdkObject), CfnDocumentationPartProps {
    /**
     * The location of the targeted API entity of the to-be-created documentation part.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationpart.html#cfn-apigateway-documentationpart-location)
     */
    override fun location(): Any = unwrap(this).getLocation()

    /**
     * The new documentation content map of the targeted API entity.
     *
     * Enclosed key-value pairs are API-specific, but only OpenAPI-compliant key-value pairs can be
     * exported and, hence, published.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationpart.html#cfn-apigateway-documentationpart-properties)
     */
    override fun properties(): String = unwrap(this).getProperties()

    /**
     * The string identifier of the associated RestApi.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationpart.html#cfn-apigateway-documentationpart-restapiid)
     */
    override fun restApiId(): String = unwrap(this).getRestApiId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDocumentationPartProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnDocumentationPartProps):
        CfnDocumentationPartProps = CdkObjectWrappers.wrap(cdkObject) as CfnDocumentationPartProps

    internal fun unwrap(wrapped: CfnDocumentationPartProps):
        software.amazon.awscdk.services.apigateway.CfnDocumentationPartProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.CfnDocumentationPartProps
  }
}
