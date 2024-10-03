@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appstream

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::AppStream::StackFleetAssociation` resource associates the specified fleet with the
 * specified stack for Amazon AppStream 2.0.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appstream.*;
 * CfnStackFleetAssociation cfnStackFleetAssociation = CfnStackFleetAssociation.Builder.create(this,
 * "MyCfnStackFleetAssociation")
 * .fleetName("fleetName")
 * .stackName("stackName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stackfleetassociation.html)
 */
public open class CfnStackFleetAssociation(
  cdkObject: software.amazon.awscdk.services.appstream.CfnStackFleetAssociation,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnStackFleetAssociationProps,
  ) :
      this(software.amazon.awscdk.services.appstream.CfnStackFleetAssociation(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnStackFleetAssociationProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnStackFleetAssociationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnStackFleetAssociationProps(props)
  )

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The name of the fleet.
   */
  public open fun fleetName(): String = unwrap(this).getFleetName()

  /**
   * The name of the fleet.
   */
  public open fun fleetName(`value`: String) {
    unwrap(this).setFleetName(`value`)
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
   * The name of the stack.
   */
  public open fun stackName(): String = unwrap(this).getStackName()

  /**
   * The name of the stack.
   */
  public open fun stackName(`value`: String) {
    unwrap(this).setStackName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.appstream.CfnStackFleetAssociation].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the fleet.
     *
     * To associate a fleet with a stack, you must specify a dependency on the fleet resource. For
     * more information, see [DependsOn
     * Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stackfleetassociation.html#cfn-appstream-stackfleetassociation-fleetname)
     * @param fleetName The name of the fleet. 
     */
    public fun fleetName(fleetName: String)

    /**
     * The name of the stack.
     *
     * To associate a fleet with a stack, you must specify a dependency on the stack resource. For
     * more information, see [DependsOn
     * Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stackfleetassociation.html#cfn-appstream-stackfleetassociation-stackname)
     * @param stackName The name of the stack. 
     */
    public fun stackName(stackName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appstream.CfnStackFleetAssociation.Builder =
        software.amazon.awscdk.services.appstream.CfnStackFleetAssociation.Builder.create(scope, id)

    /**
     * The name of the fleet.
     *
     * To associate a fleet with a stack, you must specify a dependency on the fleet resource. For
     * more information, see [DependsOn
     * Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stackfleetassociation.html#cfn-appstream-stackfleetassociation-fleetname)
     * @param fleetName The name of the fleet. 
     */
    override fun fleetName(fleetName: String) {
      cdkBuilder.fleetName(fleetName)
    }

    /**
     * The name of the stack.
     *
     * To associate a fleet with a stack, you must specify a dependency on the stack resource. For
     * more information, see [DependsOn
     * Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stackfleetassociation.html#cfn-appstream-stackfleetassociation-stackname)
     * @param stackName The name of the stack. 
     */
    override fun stackName(stackName: String) {
      cdkBuilder.stackName(stackName)
    }

    public fun build(): software.amazon.awscdk.services.appstream.CfnStackFleetAssociation =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.appstream.CfnStackFleetAssociation.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnStackFleetAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnStackFleetAssociation(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnStackFleetAssociation):
        CfnStackFleetAssociation = CfnStackFleetAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnStackFleetAssociation):
        software.amazon.awscdk.services.appstream.CfnStackFleetAssociation = wrapped.cdkObject as
        software.amazon.awscdk.services.appstream.CfnStackFleetAssociation
  }
}
