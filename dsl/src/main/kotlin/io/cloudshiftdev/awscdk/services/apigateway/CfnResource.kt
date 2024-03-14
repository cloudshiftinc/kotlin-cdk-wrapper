package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnResource internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.apigateway.CfnResource,
) : io.cloudshiftdev.awscdk.CfnResource(cdkObject), IInspectable {
  /**
   * The ID for the resource.
   *
   * For example: `abc123` .
   */
  public open fun attrResourceId(): String = unwrap(this).getAttrResourceId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The parent resource's identifier.
   */
  public open fun parentId(): String = unwrap(this).getParentId()

  /**
   * The parent resource's identifier.
   */
  public open fun parentId(`value`: String) {
    unwrap(this).setParentId(`value`)
  }

  /**
   * The last path segment for this resource.
   */
  public open fun pathPart(): String = unwrap(this).getPathPart()

  /**
   * The last path segment for this resource.
   */
  public open fun pathPart(`value`: String) {
    unwrap(this).setPathPart(`value`)
  }

  /**
   * The string identifier of the associated RestApi.
   */
  public open fun restApiId(): String = unwrap(this).getRestApiId()

  /**
   * The string identifier of the associated RestApi.
   */
  public open fun restApiId(`value`: String) {
    unwrap(this).setRestApiId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.apigateway.CfnResource].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The parent resource's identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-resource.html#cfn-apigateway-resource-parentid)
     * @param parentId The parent resource's identifier. 
     */
    public fun parentId(parentId: String)

    /**
     * The last path segment for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-resource.html#cfn-apigateway-resource-pathpart)
     * @param pathPart The last path segment for this resource. 
     */
    public fun pathPart(pathPart: String)

    /**
     * The string identifier of the associated RestApi.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-resource.html#cfn-apigateway-resource-restapiid)
     * @param restApiId The string identifier of the associated RestApi. 
     */
    public fun restApiId(restApiId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.CfnResource.Builder =
        software.amazon.awscdk.services.apigateway.CfnResource.Builder.create(scope, id)

    /**
     * The parent resource's identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-resource.html#cfn-apigateway-resource-parentid)
     * @param parentId The parent resource's identifier. 
     */
    override fun parentId(parentId: String) {
      cdkBuilder.parentId(parentId)
    }

    /**
     * The last path segment for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-resource.html#cfn-apigateway-resource-pathpart)
     * @param pathPart The last path segment for this resource. 
     */
    override fun pathPart(pathPart: String) {
      cdkBuilder.pathPart(pathPart)
    }

    /**
     * The string identifier of the associated RestApi.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-resource.html#cfn-apigateway-resource-restapiid)
     * @param restApiId The string identifier of the associated RestApi. 
     */
    override fun restApiId(restApiId: String) {
      cdkBuilder.restApiId(restApiId)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.CfnResource = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.apigateway.CfnResource.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnResource {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnResource(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnResource):
        CfnResource = CfnResource(cdkObject)

    internal fun unwrap(wrapped: CfnResource):
        software.amazon.awscdk.services.apigateway.CfnResource = wrapped.cdkObject
  }
}
