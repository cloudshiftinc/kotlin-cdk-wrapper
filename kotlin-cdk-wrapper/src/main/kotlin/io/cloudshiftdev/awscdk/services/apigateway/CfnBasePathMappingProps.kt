@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnBasePathMapping`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigateway.*;
 * CfnBasePathMappingProps cfnBasePathMappingProps = CfnBasePathMappingProps.builder()
 * .domainName("domainName")
 * // the properties below are optional
 * .basePath("basePath")
 * .id("id")
 * .restApiId("restApiId")
 * .stage("stage")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmapping.html)
 */
public interface CfnBasePathMappingProps {
  /**
   * The base path name that callers of the API must provide as part of the URL after the domain
   * name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmapping.html#cfn-apigateway-basepathmapping-basepath)
   */
  public fun basePath(): String? = unwrap(this).getBasePath()

  /**
   * The domain name of the BasePathMapping resource to be described.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmapping.html#cfn-apigateway-basepathmapping-domainname)
   */
  public fun domainName(): String

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmapping.html#cfn-apigateway-basepathmapping-id)
   */
  public fun id(): String? = unwrap(this).getId()

  /**
   * The string identifier of the associated RestApi.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmapping.html#cfn-apigateway-basepathmapping-restapiid)
   */
  public fun restApiId(): String? = unwrap(this).getRestApiId()

  /**
   * The name of the associated stage.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmapping.html#cfn-apigateway-basepathmapping-stage)
   */
  public fun stage(): String? = unwrap(this).getStage()

  /**
   * A builder for [CfnBasePathMappingProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param basePath The base path name that callers of the API must provide as part of the URL
     * after the domain name.
     */
    public fun basePath(basePath: String)

    /**
     * @param domainName The domain name of the BasePathMapping resource to be described. 
     */
    public fun domainName(domainName: String)

    /**
     * @param id the value to be set.
     */
    public fun id(id: String)

    /**
     * @param restApiId The string identifier of the associated RestApi.
     */
    public fun restApiId(restApiId: String)

    /**
     * @param stage The name of the associated stage.
     */
    public fun stage(stage: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigateway.CfnBasePathMappingProps.Builder =
        software.amazon.awscdk.services.apigateway.CfnBasePathMappingProps.builder()

    /**
     * @param basePath The base path name that callers of the API must provide as part of the URL
     * after the domain name.
     */
    override fun basePath(basePath: String) {
      cdkBuilder.basePath(basePath)
    }

    /**
     * @param domainName The domain name of the BasePathMapping resource to be described. 
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    /**
     * @param id the value to be set.
     */
    override fun id(id: String) {
      cdkBuilder.id(id)
    }

    /**
     * @param restApiId The string identifier of the associated RestApi.
     */
    override fun restApiId(restApiId: String) {
      cdkBuilder.restApiId(restApiId)
    }

    /**
     * @param stage The name of the associated stage.
     */
    override fun stage(stage: String) {
      cdkBuilder.stage(stage)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.CfnBasePathMappingProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.CfnBasePathMappingProps,
  ) : CdkObject(cdkObject), CfnBasePathMappingProps {
    /**
     * The base path name that callers of the API must provide as part of the URL after the domain
     * name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmapping.html#cfn-apigateway-basepathmapping-basepath)
     */
    override fun basePath(): String? = unwrap(this).getBasePath()

    /**
     * The domain name of the BasePathMapping resource to be described.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmapping.html#cfn-apigateway-basepathmapping-domainname)
     */
    override fun domainName(): String = unwrap(this).getDomainName()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmapping.html#cfn-apigateway-basepathmapping-id)
     */
    override fun id(): String? = unwrap(this).getId()

    /**
     * The string identifier of the associated RestApi.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmapping.html#cfn-apigateway-basepathmapping-restapiid)
     */
    override fun restApiId(): String? = unwrap(this).getRestApiId()

    /**
     * The name of the associated stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmapping.html#cfn-apigateway-basepathmapping-stage)
     */
    override fun stage(): String? = unwrap(this).getStage()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnBasePathMappingProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnBasePathMappingProps):
        CfnBasePathMappingProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnBasePathMappingProps):
        software.amazon.awscdk.services.apigateway.CfnBasePathMappingProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.CfnBasePathMappingProps
  }
}
