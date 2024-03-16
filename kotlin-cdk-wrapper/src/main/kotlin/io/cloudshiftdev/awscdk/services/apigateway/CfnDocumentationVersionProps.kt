@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnDocumentationVersion`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigateway.*;
 * CfnDocumentationVersionProps cfnDocumentationVersionProps =
 * CfnDocumentationVersionProps.builder()
 * .documentationVersion("documentationVersion")
 * .restApiId("restApiId")
 * // the properties below are optional
 * .description("description")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationversion.html)
 */
public interface CfnDocumentationVersionProps {
  /**
   * A description about the new documentation snapshot.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationversion.html#cfn-apigateway-documentationversion-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The version identifier of the to-be-updated documentation version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationversion.html#cfn-apigateway-documentationversion-documentationversion)
   */
  public fun documentationVersion(): String

  /**
   * The string identifier of the associated RestApi.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationversion.html#cfn-apigateway-documentationversion-restapiid)
   */
  public fun restApiId(): String

  /**
   * A builder for [CfnDocumentationVersionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description A description about the new documentation snapshot.
     */
    public fun description(description: String)

    /**
     * @param documentationVersion The version identifier of the to-be-updated documentation
     * version. 
     */
    public fun documentationVersion(documentationVersion: String)

    /**
     * @param restApiId The string identifier of the associated RestApi. 
     */
    public fun restApiId(restApiId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigateway.CfnDocumentationVersionProps.Builder =
        software.amazon.awscdk.services.apigateway.CfnDocumentationVersionProps.builder()

    /**
     * @param description A description about the new documentation snapshot.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param documentationVersion The version identifier of the to-be-updated documentation
     * version. 
     */
    override fun documentationVersion(documentationVersion: String) {
      cdkBuilder.documentationVersion(documentationVersion)
    }

    /**
     * @param restApiId The string identifier of the associated RestApi. 
     */
    override fun restApiId(restApiId: String) {
      cdkBuilder.restApiId(restApiId)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.CfnDocumentationVersionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.CfnDocumentationVersionProps,
  ) : CdkObject(cdkObject), CfnDocumentationVersionProps {
    /**
     * A description about the new documentation snapshot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationversion.html#cfn-apigateway-documentationversion-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The version identifier of the to-be-updated documentation version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationversion.html#cfn-apigateway-documentationversion-documentationversion)
     */
    override fun documentationVersion(): String = unwrap(this).getDocumentationVersion()

    /**
     * The string identifier of the associated RestApi.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationversion.html#cfn-apigateway-documentationversion-restapiid)
     */
    override fun restApiId(): String = unwrap(this).getRestApiId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDocumentationVersionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnDocumentationVersionProps):
        CfnDocumentationVersionProps = CdkObjectWrappers.wrap(cdkObject) as
        CfnDocumentationVersionProps

    internal fun unwrap(wrapped: CfnDocumentationVersionProps):
        software.amazon.awscdk.services.apigateway.CfnDocumentationVersionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.apigateway.CfnDocumentationVersionProps
  }
}
