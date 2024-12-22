@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnBasePathMappingV2`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigateway.*;
 * CfnBasePathMappingV2Props cfnBasePathMappingV2Props = CfnBasePathMappingV2Props.builder()
 * .domainNameArn("domainNameArn")
 * .restApiId("restApiId")
 * // the properties below are optional
 * .basePath("basePath")
 * .stage("stage")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmappingv2.html)
 */
public interface CfnBasePathMappingV2Props {
  /**
   * The base path name that callers of the private API must provide as part of the URL after the
   * domain name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmappingv2.html#cfn-apigateway-basepathmappingv2-basepath)
   */
  public fun basePath(): String? = unwrap(this).getBasePath()

  /**
   * The ARN of the domain name for the BasePathMappingV2 resource to be described.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmappingv2.html#cfn-apigateway-basepathmappingv2-domainnamearn)
   */
  public fun domainNameArn(): String

  /**
   * The private API's identifier.
   *
   * This identifier is unique across all of your APIs in API Gateway.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmappingv2.html#cfn-apigateway-basepathmappingv2-restapiid)
   */
  public fun restApiId(): String

  /**
   * Represents a unique identifier for a version of a deployed private RestApi that is callable by
   * users.
   *
   * The Stage must depend on the `RestApi` 's stage. To create a dependency, add a DependsOn
   * attribute to the BasePathMappingV2 resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmappingv2.html#cfn-apigateway-basepathmappingv2-stage)
   */
  public fun stage(): String? = unwrap(this).getStage()

  /**
   * A builder for [CfnBasePathMappingV2Props]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param basePath The base path name that callers of the private API must provide as part of
     * the URL after the domain name.
     */
    public fun basePath(basePath: String)

    /**
     * @param domainNameArn The ARN of the domain name for the BasePathMappingV2 resource to be
     * described. 
     */
    public fun domainNameArn(domainNameArn: String)

    /**
     * @param restApiId The private API's identifier. 
     * This identifier is unique across all of your APIs in API Gateway.
     */
    public fun restApiId(restApiId: String)

    /**
     * @param stage Represents a unique identifier for a version of a deployed private RestApi that
     * is callable by users.
     * The Stage must depend on the `RestApi` 's stage. To create a dependency, add a DependsOn
     * attribute to the BasePathMappingV2 resource.
     */
    public fun stage(stage: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigateway.CfnBasePathMappingV2Props.Builder =
        software.amazon.awscdk.services.apigateway.CfnBasePathMappingV2Props.builder()

    /**
     * @param basePath The base path name that callers of the private API must provide as part of
     * the URL after the domain name.
     */
    override fun basePath(basePath: String) {
      cdkBuilder.basePath(basePath)
    }

    /**
     * @param domainNameArn The ARN of the domain name for the BasePathMappingV2 resource to be
     * described. 
     */
    override fun domainNameArn(domainNameArn: String) {
      cdkBuilder.domainNameArn(domainNameArn)
    }

    /**
     * @param restApiId The private API's identifier. 
     * This identifier is unique across all of your APIs in API Gateway.
     */
    override fun restApiId(restApiId: String) {
      cdkBuilder.restApiId(restApiId)
    }

    /**
     * @param stage Represents a unique identifier for a version of a deployed private RestApi that
     * is callable by users.
     * The Stage must depend on the `RestApi` 's stage. To create a dependency, add a DependsOn
     * attribute to the BasePathMappingV2 resource.
     */
    override fun stage(stage: String) {
      cdkBuilder.stage(stage)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.CfnBasePathMappingV2Props =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.apigateway.CfnBasePathMappingV2Props,
  ) : CdkObject(cdkObject),
      CfnBasePathMappingV2Props {
    /**
     * The base path name that callers of the private API must provide as part of the URL after the
     * domain name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmappingv2.html#cfn-apigateway-basepathmappingv2-basepath)
     */
    override fun basePath(): String? = unwrap(this).getBasePath()

    /**
     * The ARN of the domain name for the BasePathMappingV2 resource to be described.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmappingv2.html#cfn-apigateway-basepathmappingv2-domainnamearn)
     */
    override fun domainNameArn(): String = unwrap(this).getDomainNameArn()

    /**
     * The private API's identifier.
     *
     * This identifier is unique across all of your APIs in API Gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmappingv2.html#cfn-apigateway-basepathmappingv2-restapiid)
     */
    override fun restApiId(): String = unwrap(this).getRestApiId()

    /**
     * Represents a unique identifier for a version of a deployed private RestApi that is callable
     * by users.
     *
     * The Stage must depend on the `RestApi` 's stage. To create a dependency, add a DependsOn
     * attribute to the BasePathMappingV2 resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmappingv2.html#cfn-apigateway-basepathmappingv2-stage)
     */
    override fun stage(): String? = unwrap(this).getStage()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnBasePathMappingV2Props {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnBasePathMappingV2Props):
        CfnBasePathMappingV2Props = CdkObjectWrappers.wrap(cdkObject) as? CfnBasePathMappingV2Props
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnBasePathMappingV2Props):
        software.amazon.awscdk.services.apigateway.CfnBasePathMappingV2Props = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.CfnBasePathMappingV2Props
  }
}
