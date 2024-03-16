@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnResource`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigateway.*;
 * CfnResourceProps cfnResourceProps = CfnResourceProps.builder()
 * .parentId("parentId")
 * .pathPart("pathPart")
 * .restApiId("restApiId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-resource.html)
 */
public interface CfnResourceProps {
  /**
   * The parent resource's identifier.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-resource.html#cfn-apigateway-resource-parentid)
   */
  public fun parentId(): String

  /**
   * The last path segment for this resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-resource.html#cfn-apigateway-resource-pathpart)
   */
  public fun pathPart(): String

  /**
   * The string identifier of the associated RestApi.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-resource.html#cfn-apigateway-resource-restapiid)
   */
  public fun restApiId(): String

  /**
   * A builder for [CfnResourceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param parentId The parent resource's identifier. 
     */
    public fun parentId(parentId: String)

    /**
     * @param pathPart The last path segment for this resource. 
     */
    public fun pathPart(pathPart: String)

    /**
     * @param restApiId The string identifier of the associated RestApi. 
     */
    public fun restApiId(restApiId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.CfnResourceProps.Builder =
        software.amazon.awscdk.services.apigateway.CfnResourceProps.builder()

    /**
     * @param parentId The parent resource's identifier. 
     */
    override fun parentId(parentId: String) {
      cdkBuilder.parentId(parentId)
    }

    /**
     * @param pathPart The last path segment for this resource. 
     */
    override fun pathPart(pathPart: String) {
      cdkBuilder.pathPart(pathPart)
    }

    /**
     * @param restApiId The string identifier of the associated RestApi. 
     */
    override fun restApiId(restApiId: String) {
      cdkBuilder.restApiId(restApiId)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.CfnResourceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.CfnResourceProps,
  ) : CdkObject(cdkObject), CfnResourceProps {
    /**
     * The parent resource's identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-resource.html#cfn-apigateway-resource-parentid)
     */
    override fun parentId(): String = unwrap(this).getParentId()

    /**
     * The last path segment for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-resource.html#cfn-apigateway-resource-pathpart)
     */
    override fun pathPart(): String = unwrap(this).getPathPart()

    /**
     * The string identifier of the associated RestApi.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-resource.html#cfn-apigateway-resource-restapiid)
     */
    override fun restApiId(): String = unwrap(this).getRestApiId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnResourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnResourceProps):
        CfnResourceProps = CdkObjectWrappers.wrap(cdkObject) as CfnResourceProps

    internal fun unwrap(wrapped: CfnResourceProps):
        software.amazon.awscdk.services.apigateway.CfnResourceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.CfnResourceProps
  }
}
