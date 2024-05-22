@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Represents a state machine
 * [version](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-state-machine-version.html)
 * . A published version uses the latest state machine
 * [*revision*](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-state-machine-version.html)
 * . A revision is an immutable, read-only snapshot of a state machine’s definition and configuration.
 *
 * You can publish up to 1000 versions for each state machine.
 *
 *
 * Before you delete a version, make sure that version's ARN isn't being referenced in any
 * long-running workflows or application code outside of the stack.
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.stepfunctions.*;
 * CfnStateMachineVersion cfnStateMachineVersion = CfnStateMachineVersion.Builder.create(this,
 * "MyCfnStateMachineVersion")
 * .stateMachineArn("stateMachineArn")
 * // the properties below are optional
 * .description("description")
 * .stateMachineRevisionId("stateMachineRevisionId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachineversion.html)
 */
public open class CfnStateMachineVersion(
  cdkObject: software.amazon.awscdk.services.stepfunctions.CfnStateMachineVersion,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnStateMachineVersionProps,
  ) :
      this(software.amazon.awscdk.services.stepfunctions.CfnStateMachineVersion(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnStateMachineVersionProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnStateMachineVersionProps.Builder.() -> Unit,
  ) : this(scope, id, CfnStateMachineVersionProps(props)
  )

  /**
   * Returns the ARN of the state machine version.
   *
   * For example, `arn:aws:states:us-east-1:123456789012:stateMachine:myStateMachine:1` .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * An optional description of the state machine version.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * An optional description of the state machine version.
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
   * The Amazon Resource Name (ARN) of the state machine.
   */
  public open fun stateMachineArn(): String = unwrap(this).getStateMachineArn()

  /**
   * The Amazon Resource Name (ARN) of the state machine.
   */
  public open fun stateMachineArn(`value`: String) {
    unwrap(this).setStateMachineArn(`value`)
  }

  /**
   * Identifier for a state machine revision, which is an immutable, read-only snapshot of a state
   * machine’s definition and configuration.
   */
  public open fun stateMachineRevisionId(): String? = unwrap(this).getStateMachineRevisionId()

  /**
   * Identifier for a state machine revision, which is an immutable, read-only snapshot of a state
   * machine’s definition and configuration.
   */
  public open fun stateMachineRevisionId(`value`: String) {
    unwrap(this).setStateMachineRevisionId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.stepfunctions.CfnStateMachineVersion].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * An optional description of the state machine version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachineversion.html#cfn-stepfunctions-statemachineversion-description)
     * @param description An optional description of the state machine version. 
     */
    public fun description(description: String)

    /**
     * The Amazon Resource Name (ARN) of the state machine.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachineversion.html#cfn-stepfunctions-statemachineversion-statemachinearn)
     * @param stateMachineArn The Amazon Resource Name (ARN) of the state machine. 
     */
    public fun stateMachineArn(stateMachineArn: String)

    /**
     * Identifier for a state machine revision, which is an immutable, read-only snapshot of a state
     * machine’s definition and configuration.
     *
     * Only publish the state machine version if the current state machine's revision ID matches the
     * specified ID. Use this option to avoid publishing a version if the state machine has changed
     * since you last updated it.
     *
     * To specify the initial state machine revision, set the value as `INITIAL` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachineversion.html#cfn-stepfunctions-statemachineversion-statemachinerevisionid)
     * @param stateMachineRevisionId Identifier for a state machine revision, which is an immutable,
     * read-only snapshot of a state machine’s definition and configuration. 
     */
    public fun stateMachineRevisionId(stateMachineRevisionId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.CfnStateMachineVersion.Builder =
        software.amazon.awscdk.services.stepfunctions.CfnStateMachineVersion.Builder.create(scope,
        id)

    /**
     * An optional description of the state machine version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachineversion.html#cfn-stepfunctions-statemachineversion-description)
     * @param description An optional description of the state machine version. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The Amazon Resource Name (ARN) of the state machine.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachineversion.html#cfn-stepfunctions-statemachineversion-statemachinearn)
     * @param stateMachineArn The Amazon Resource Name (ARN) of the state machine. 
     */
    override fun stateMachineArn(stateMachineArn: String) {
      cdkBuilder.stateMachineArn(stateMachineArn)
    }

    /**
     * Identifier for a state machine revision, which is an immutable, read-only snapshot of a state
     * machine’s definition and configuration.
     *
     * Only publish the state machine version if the current state machine's revision ID matches the
     * specified ID. Use this option to avoid publishing a version if the state machine has changed
     * since you last updated it.
     *
     * To specify the initial state machine revision, set the value as `INITIAL` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachineversion.html#cfn-stepfunctions-statemachineversion-statemachinerevisionid)
     * @param stateMachineRevisionId Identifier for a state machine revision, which is an immutable,
     * read-only snapshot of a state machine’s definition and configuration. 
     */
    override fun stateMachineRevisionId(stateMachineRevisionId: String) {
      cdkBuilder.stateMachineRevisionId(stateMachineRevisionId)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.CfnStateMachineVersion =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.stepfunctions.CfnStateMachineVersion.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnStateMachineVersion {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnStateMachineVersion(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.CfnStateMachineVersion):
        CfnStateMachineVersion = CfnStateMachineVersion(cdkObject)

    internal fun unwrap(wrapped: CfnStateMachineVersion):
        software.amazon.awscdk.services.stepfunctions.CfnStateMachineVersion = wrapped.cdkObject as
        software.amazon.awscdk.services.stepfunctions.CfnStateMachineVersion
  }
}
