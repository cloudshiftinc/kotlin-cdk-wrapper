@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.connect

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a version for the specified customer-managed flow within the specified instance.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.connect.*;
 * CfnContactFlowVersion cfnContactFlowVersion = CfnContactFlowVersion.Builder.create(this,
 * "MyCfnContactFlowVersion")
 * .contactFlowId("contactFlowId")
 * // the properties below are optional
 * .description("description")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-contactflowversion.html)
 */
public open class CfnContactFlowVersion(
  cdkObject: software.amazon.awscdk.services.connect.CfnContactFlowVersion,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnContactFlowVersionProps,
  ) :
      this(software.amazon.awscdk.services.connect.CfnContactFlowVersion(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnContactFlowVersionProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnContactFlowVersionProps.Builder.() -> Unit,
  ) : this(scope, id, CfnContactFlowVersionProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the flow version.
   */
  public open fun attrContactFlowVersionArn(): String = unwrap(this).getAttrContactFlowVersionArn()

  /**
   * Indicates the checksum value of the flow content.
   */
  public open fun attrFlowContentSha256(): String = unwrap(this).getAttrFlowContentSha256()

  /**
   * The identifier of the flow version.
   */
  public open fun attrVersion(): Number = unwrap(this).getAttrVersion()

  /**
   * The identifier of the flow.
   */
  public open fun contactFlowId(): String = unwrap(this).getContactFlowId()

  /**
   * The identifier of the flow.
   */
  public open fun contactFlowId(`value`: String) {
    unwrap(this).setContactFlowId(`value`)
  }

  /**
   * The description of the flow version.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the flow version.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
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
   * A fluent builder for [io.cloudshiftdev.awscdk.services.connect.CfnContactFlowVersion].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The identifier of the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-contactflowversion.html#cfn-connect-contactflowversion-contactflowid)
     * @param contactFlowId The identifier of the flow. 
     */
    public fun contactFlowId(contactFlowId: String)

    /**
     * The description of the flow version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-contactflowversion.html#cfn-connect-contactflowversion-description)
     * @param description The description of the flow version. 
     */
    public fun description(description: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.connect.CfnContactFlowVersion.Builder =
        software.amazon.awscdk.services.connect.CfnContactFlowVersion.Builder.create(scope, id)

    /**
     * The identifier of the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-contactflowversion.html#cfn-connect-contactflowversion-contactflowid)
     * @param contactFlowId The identifier of the flow. 
     */
    override fun contactFlowId(contactFlowId: String) {
      cdkBuilder.contactFlowId(contactFlowId)
    }

    /**
     * The description of the flow version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-contactflowversion.html#cfn-connect-contactflowversion-description)
     * @param description The description of the flow version. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public fun build(): software.amazon.awscdk.services.connect.CfnContactFlowVersion =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.connect.CfnContactFlowVersion.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnContactFlowVersion {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnContactFlowVersion(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnContactFlowVersion):
        CfnContactFlowVersion = CfnContactFlowVersion(cdkObject)

    internal fun unwrap(wrapped: CfnContactFlowVersion):
        software.amazon.awscdk.services.connect.CfnContactFlowVersion = wrapped.cdkObject as
        software.amazon.awscdk.services.connect.CfnContactFlowVersion
  }
}
