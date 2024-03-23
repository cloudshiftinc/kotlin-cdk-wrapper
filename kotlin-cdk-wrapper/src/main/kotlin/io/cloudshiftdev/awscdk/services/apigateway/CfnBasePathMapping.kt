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
 * The `AWS::ApiGateway::BasePathMapping` resource creates a base path that clients who call your
 * API must use in the invocation URL.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigateway.*;
 * CfnBasePathMapping cfnBasePathMapping = CfnBasePathMapping.Builder.create(this,
 * "MyCfnBasePathMapping")
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
public open class CfnBasePathMapping(
  cdkObject: software.amazon.awscdk.services.apigateway.CfnBasePathMapping,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnBasePathMappingProps,
  ) :
      this(software.amazon.awscdk.services.apigateway.CfnBasePathMapping(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnBasePathMappingProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnBasePathMappingProps.Builder.() -> Unit,
  ) : this(scope, id, CfnBasePathMappingProps(props)
  )

  /**
   * The base path name that callers of the API must provide as part of the URL after the domain
   * name.
   */
  public open fun basePath(): String? = unwrap(this).getBasePath()

  /**
   * The base path name that callers of the API must provide as part of the URL after the domain
   * name.
   */
  public open fun basePath(`value`: String) {
    unwrap(this).setBasePath(`value`)
  }

  /**
   * The domain name of the BasePathMapping resource to be described.
   */
  public open fun domainName(): String = unwrap(this).getDomainName()

  /**
   * The domain name of the BasePathMapping resource to be described.
   */
  public open fun domainName(`value`: String) {
    unwrap(this).setDomainName(`value`)
  }

  /**
   *
   */
  public open fun id(): String? = unwrap(this).getId()

  /**
   *
   */
  public open fun id(`value`: String) {
    unwrap(this).setId(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The string identifier of the associated RestApi.
   */
  public open fun restApiId(): String? = unwrap(this).getRestApiId()

  /**
   * The string identifier of the associated RestApi.
   */
  public open fun restApiId(`value`: String) {
    unwrap(this).setRestApiId(`value`)
  }

  /**
   * The name of the associated stage.
   */
  public open fun stage(): String? = unwrap(this).getStage()

  /**
   * The name of the associated stage.
   */
  public open fun stage(`value`: String) {
    unwrap(this).setStage(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.apigateway.CfnBasePathMapping].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The base path name that callers of the API must provide as part of the URL after the domain
     * name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmapping.html#cfn-apigateway-basepathmapping-basepath)
     * @param basePath The base path name that callers of the API must provide as part of the URL
     * after the domain name. 
     */
    public fun basePath(basePath: String)

    /**
     * The domain name of the BasePathMapping resource to be described.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmapping.html#cfn-apigateway-basepathmapping-domainname)
     * @param domainName The domain name of the BasePathMapping resource to be described. 
     */
    public fun domainName(domainName: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmapping.html#cfn-apigateway-basepathmapping-id)
     * @param id 
     */
    public fun id(id: String)

    /**
     * The string identifier of the associated RestApi.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmapping.html#cfn-apigateway-basepathmapping-restapiid)
     * @param restApiId The string identifier of the associated RestApi. 
     */
    public fun restApiId(restApiId: String)

    /**
     * The name of the associated stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmapping.html#cfn-apigateway-basepathmapping-stage)
     * @param stage The name of the associated stage. 
     */
    public fun stage(stage: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.CfnBasePathMapping.Builder =
        software.amazon.awscdk.services.apigateway.CfnBasePathMapping.Builder.create(scope, id)

    /**
     * The base path name that callers of the API must provide as part of the URL after the domain
     * name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmapping.html#cfn-apigateway-basepathmapping-basepath)
     * @param basePath The base path name that callers of the API must provide as part of the URL
     * after the domain name. 
     */
    override fun basePath(basePath: String) {
      cdkBuilder.basePath(basePath)
    }

    /**
     * The domain name of the BasePathMapping resource to be described.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmapping.html#cfn-apigateway-basepathmapping-domainname)
     * @param domainName The domain name of the BasePathMapping resource to be described. 
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmapping.html#cfn-apigateway-basepathmapping-id)
     * @param id 
     */
    override fun id(id: String) {
      cdkBuilder.id(id)
    }

    /**
     * The string identifier of the associated RestApi.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmapping.html#cfn-apigateway-basepathmapping-restapiid)
     * @param restApiId The string identifier of the associated RestApi. 
     */
    override fun restApiId(restApiId: String) {
      cdkBuilder.restApiId(restApiId)
    }

    /**
     * The name of the associated stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmapping.html#cfn-apigateway-basepathmapping-stage)
     * @param stage The name of the associated stage. 
     */
    override fun stage(stage: String) {
      cdkBuilder.stage(stage)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.CfnBasePathMapping =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.apigateway.CfnBasePathMapping.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnBasePathMapping {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnBasePathMapping(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnBasePathMapping):
        CfnBasePathMapping = CfnBasePathMapping(cdkObject)

    internal fun unwrap(wrapped: CfnBasePathMapping):
        software.amazon.awscdk.services.apigateway.CfnBasePathMapping = wrapped.cdkObject as
        software.amazon.awscdk.services.apigateway.CfnBasePathMapping
  }
}
