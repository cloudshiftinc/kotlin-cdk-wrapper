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
 * The `AWS::ApiGateway::DocumentationVersion` resource creates a snapshot of the documentation for
 * an API.
 *
 * For more information, see [Representation of API Documentation in API
 * Gateway](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-documenting-api-content-representation.html)
 * in the *API Gateway Developer Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigateway.*;
 * CfnDocumentationVersion cfnDocumentationVersion = CfnDocumentationVersion.Builder.create(this,
 * "MyCfnDocumentationVersion")
 * .documentationVersion("documentationVersion")
 * .restApiId("restApiId")
 * // the properties below are optional
 * .description("description")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationversion.html)
 */
public open class CfnDocumentationVersion internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.apigateway.CfnDocumentationVersion,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDocumentationVersionProps,
  ) :
      this(software.amazon.awscdk.services.apigateway.CfnDocumentationVersion(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnDocumentationVersionProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDocumentationVersionProps.Builder.() -> Unit,
  ) : this(scope, id, CfnDocumentationVersionProps(props)
  )

  /**
   * A description about the new documentation snapshot.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description about the new documentation snapshot.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The version identifier of the to-be-updated documentation version.
   */
  public open fun documentationVersion(): String = unwrap(this).getDocumentationVersion()

  /**
   * The version identifier of the to-be-updated documentation version.
   */
  public open fun documentationVersion(`value`: String) {
    unwrap(this).setDocumentationVersion(`value`)
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
  public open fun restApiId(): String = unwrap(this).getRestApiId()

  /**
   * The string identifier of the associated RestApi.
   */
  public open fun restApiId(`value`: String) {
    unwrap(this).setRestApiId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.apigateway.CfnDocumentationVersion].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A description about the new documentation snapshot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationversion.html#cfn-apigateway-documentationversion-description)
     * @param description A description about the new documentation snapshot. 
     */
    public fun description(description: String)

    /**
     * The version identifier of the to-be-updated documentation version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationversion.html#cfn-apigateway-documentationversion-documentationversion)
     * @param documentationVersion The version identifier of the to-be-updated documentation
     * version. 
     */
    public fun documentationVersion(documentationVersion: String)

    /**
     * The string identifier of the associated RestApi.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationversion.html#cfn-apigateway-documentationversion-restapiid)
     * @param restApiId The string identifier of the associated RestApi. 
     */
    public fun restApiId(restApiId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigateway.CfnDocumentationVersion.Builder =
        software.amazon.awscdk.services.apigateway.CfnDocumentationVersion.Builder.create(scope, id)

    /**
     * A description about the new documentation snapshot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationversion.html#cfn-apigateway-documentationversion-description)
     * @param description A description about the new documentation snapshot. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The version identifier of the to-be-updated documentation version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationversion.html#cfn-apigateway-documentationversion-documentationversion)
     * @param documentationVersion The version identifier of the to-be-updated documentation
     * version. 
     */
    override fun documentationVersion(documentationVersion: String) {
      cdkBuilder.documentationVersion(documentationVersion)
    }

    /**
     * The string identifier of the associated RestApi.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationversion.html#cfn-apigateway-documentationversion-restapiid)
     * @param restApiId The string identifier of the associated RestApi. 
     */
    override fun restApiId(restApiId: String) {
      cdkBuilder.restApiId(restApiId)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.CfnDocumentationVersion =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.apigateway.CfnDocumentationVersion.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDocumentationVersion {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDocumentationVersion(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnDocumentationVersion):
        CfnDocumentationVersion = CfnDocumentationVersion(cdkObject)

    internal fun unwrap(wrapped: CfnDocumentationVersion):
        software.amazon.awscdk.services.apigateway.CfnDocumentationVersion = wrapped.cdkObject
  }
}
