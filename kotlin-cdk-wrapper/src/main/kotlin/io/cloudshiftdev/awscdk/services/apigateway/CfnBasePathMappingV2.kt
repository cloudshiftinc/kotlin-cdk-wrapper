@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::ApiGateway::BasePathMappingV2` resource creates a base path that clients who call your
 * API must use in the invocation URL.
 *
 * Supported only for private custom domain names.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigateway.*;
 * CfnBasePathMappingV2 cfnBasePathMappingV2 = CfnBasePathMappingV2.Builder.create(this,
 * "MyCfnBasePathMappingV2")
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
public open class CfnBasePathMappingV2(
  cdkObject: software.amazon.awscdk.services.apigateway.CfnBasePathMappingV2,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnBasePathMappingV2Props,
  ) :
      this(software.amazon.awscdk.services.apigateway.CfnBasePathMappingV2(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnBasePathMappingV2Props.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnBasePathMappingV2Props.Builder.() -> Unit,
  ) : this(scope, id, CfnBasePathMappingV2Props(props)
  )

  /**
   * Amazon Resource Name (ARN) of the resource.
   */
  public open fun attrBasePathMappingArn(): String = unwrap(this).getAttrBasePathMappingArn()

  /**
   * The base path name that callers of the private API must provide as part of the URL after the
   * domain name.
   */
  public open fun basePath(): String? = unwrap(this).getBasePath()

  /**
   * The base path name that callers of the private API must provide as part of the URL after the
   * domain name.
   */
  public open fun basePath(`value`: String) {
    unwrap(this).setBasePath(`value`)
  }

  /**
   * The ARN of the domain name for the BasePathMappingV2 resource to be described.
   */
  public open fun domainNameArn(): String = unwrap(this).getDomainNameArn()

  /**
   * The ARN of the domain name for the BasePathMappingV2 resource to be described.
   */
  public open fun domainNameArn(`value`: String) {
    unwrap(this).setDomainNameArn(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The private API's identifier.
   */
  public open fun restApiId(): String = unwrap(this).getRestApiId()

  /**
   * The private API's identifier.
   */
  public open fun restApiId(`value`: String) {
    unwrap(this).setRestApiId(`value`)
  }

  /**
   * Represents a unique identifier for a version of a deployed private RestApi that is callable by
   * users.
   */
  public open fun stage(): String? = unwrap(this).getStage()

  /**
   * Represents a unique identifier for a version of a deployed private RestApi that is callable by
   * users.
   */
  public open fun stage(`value`: String) {
    unwrap(this).setStage(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.apigateway.CfnBasePathMappingV2].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The base path name that callers of the private API must provide as part of the URL after the
     * domain name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmappingv2.html#cfn-apigateway-basepathmappingv2-basepath)
     * @param basePath The base path name that callers of the private API must provide as part of
     * the URL after the domain name. 
     */
    public fun basePath(basePath: String)

    /**
     * The ARN of the domain name for the BasePathMappingV2 resource to be described.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmappingv2.html#cfn-apigateway-basepathmappingv2-domainnamearn)
     * @param domainNameArn The ARN of the domain name for the BasePathMappingV2 resource to be
     * described. 
     */
    public fun domainNameArn(domainNameArn: String)

    /**
     * The private API's identifier.
     *
     * This identifier is unique across all of your APIs in API Gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmappingv2.html#cfn-apigateway-basepathmappingv2-restapiid)
     * @param restApiId The private API's identifier. 
     */
    public fun restApiId(restApiId: String)

    /**
     * Represents a unique identifier for a version of a deployed private RestApi that is callable
     * by users.
     *
     * The Stage must depend on the `RestApi` 's stage. To create a dependency, add a DependsOn
     * attribute to the BasePathMappingV2 resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmappingv2.html#cfn-apigateway-basepathmappingv2-stage)
     * @param stage Represents a unique identifier for a version of a deployed private RestApi that
     * is callable by users. 
     */
    public fun stage(stage: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.CfnBasePathMappingV2.Builder
        = software.amazon.awscdk.services.apigateway.CfnBasePathMappingV2.Builder.create(scope, id)

    /**
     * The base path name that callers of the private API must provide as part of the URL after the
     * domain name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmappingv2.html#cfn-apigateway-basepathmappingv2-basepath)
     * @param basePath The base path name that callers of the private API must provide as part of
     * the URL after the domain name. 
     */
    override fun basePath(basePath: String) {
      cdkBuilder.basePath(basePath)
    }

    /**
     * The ARN of the domain name for the BasePathMappingV2 resource to be described.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmappingv2.html#cfn-apigateway-basepathmappingv2-domainnamearn)
     * @param domainNameArn The ARN of the domain name for the BasePathMappingV2 resource to be
     * described. 
     */
    override fun domainNameArn(domainNameArn: String) {
      cdkBuilder.domainNameArn(domainNameArn)
    }

    /**
     * The private API's identifier.
     *
     * This identifier is unique across all of your APIs in API Gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmappingv2.html#cfn-apigateway-basepathmappingv2-restapiid)
     * @param restApiId The private API's identifier. 
     */
    override fun restApiId(restApiId: String) {
      cdkBuilder.restApiId(restApiId)
    }

    /**
     * Represents a unique identifier for a version of a deployed private RestApi that is callable
     * by users.
     *
     * The Stage must depend on the `RestApi` 's stage. To create a dependency, add a DependsOn
     * attribute to the BasePathMappingV2 resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmappingv2.html#cfn-apigateway-basepathmappingv2-stage)
     * @param stage Represents a unique identifier for a version of a deployed private RestApi that
     * is callable by users. 
     */
    override fun stage(stage: String) {
      cdkBuilder.stage(stage)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.CfnBasePathMappingV2 =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.apigateway.CfnBasePathMappingV2.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnBasePathMappingV2 {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnBasePathMappingV2(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnBasePathMappingV2):
        CfnBasePathMappingV2 = CfnBasePathMappingV2(cdkObject)

    internal fun unwrap(wrapped: CfnBasePathMappingV2):
        software.amazon.awscdk.services.apigateway.CfnBasePathMappingV2 = wrapped.cdkObject as
        software.amazon.awscdk.services.apigateway.CfnBasePathMappingV2
  }
}
