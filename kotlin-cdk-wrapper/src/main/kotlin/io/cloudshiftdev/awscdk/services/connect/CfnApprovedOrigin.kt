@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.connect

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The approved origin for the instance.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.connect.*;
 * CfnApprovedOrigin cfnApprovedOrigin = CfnApprovedOrigin.Builder.create(this,
 * "MyCfnApprovedOrigin")
 * .instanceId("instanceId")
 * .origin("origin")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-approvedorigin.html)
 */
public open class CfnApprovedOrigin(
  cdkObject: software.amazon.awscdk.services.connect.CfnApprovedOrigin,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnApprovedOriginProps,
  ) :
      this(software.amazon.awscdk.services.connect.CfnApprovedOrigin(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnApprovedOriginProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnApprovedOriginProps.Builder.() -> Unit,
  ) : this(scope, id, CfnApprovedOriginProps(props)
  )

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The Amazon Resource Name (ARN) of the instance.
   */
  public open fun instanceId(): String = unwrap(this).getInstanceId()

  /**
   * The Amazon Resource Name (ARN) of the instance.
   */
  public open fun instanceId(`value`: String) {
    unwrap(this).setInstanceId(`value`)
  }

  /**
   * Domain name to be added to the allow-list of the instance.
   */
  public open fun origin(): String = unwrap(this).getOrigin()

  /**
   * Domain name to be added to the allow-list of the instance.
   */
  public open fun origin(`value`: String) {
    unwrap(this).setOrigin(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.connect.CfnApprovedOrigin].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Amazon Resource Name (ARN) of the instance.
     *
     * *Minimum* : `1`
     *
     * *Maximum* : `100`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-approvedorigin.html#cfn-connect-approvedorigin-instanceid)
     * @param instanceId The Amazon Resource Name (ARN) of the instance. 
     */
    public fun instanceId(instanceId: String)

    /**
     * Domain name to be added to the allow-list of the instance.
     *
     * *Maximum* : `267`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-approvedorigin.html#cfn-connect-approvedorigin-origin)
     * @param origin Domain name to be added to the allow-list of the instance. 
     */
    public fun origin(origin: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.connect.CfnApprovedOrigin.Builder =
        software.amazon.awscdk.services.connect.CfnApprovedOrigin.Builder.create(scope, id)

    /**
     * The Amazon Resource Name (ARN) of the instance.
     *
     * *Minimum* : `1`
     *
     * *Maximum* : `100`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-approvedorigin.html#cfn-connect-approvedorigin-instanceid)
     * @param instanceId The Amazon Resource Name (ARN) of the instance. 
     */
    override fun instanceId(instanceId: String) {
      cdkBuilder.instanceId(instanceId)
    }

    /**
     * Domain name to be added to the allow-list of the instance.
     *
     * *Maximum* : `267`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-approvedorigin.html#cfn-connect-approvedorigin-origin)
     * @param origin Domain name to be added to the allow-list of the instance. 
     */
    override fun origin(origin: String) {
      cdkBuilder.origin(origin)
    }

    public fun build(): software.amazon.awscdk.services.connect.CfnApprovedOrigin =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.connect.CfnApprovedOrigin.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnApprovedOrigin {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnApprovedOrigin(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnApprovedOrigin):
        CfnApprovedOrigin = CfnApprovedOrigin(cdkObject)

    internal fun unwrap(wrapped: CfnApprovedOrigin):
        software.amazon.awscdk.services.connect.CfnApprovedOrigin = wrapped.cdkObject as
        software.amazon.awscdk.services.connect.CfnApprovedOrigin
  }
}
