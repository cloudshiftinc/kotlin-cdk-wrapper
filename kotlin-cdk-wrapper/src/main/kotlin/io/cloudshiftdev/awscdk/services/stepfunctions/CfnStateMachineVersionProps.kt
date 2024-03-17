@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnStateMachineVersion`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.stepfunctions.*;
 * CfnStateMachineVersionProps cfnStateMachineVersionProps = CfnStateMachineVersionProps.builder()
 * .stateMachineArn("stateMachineArn")
 * // the properties below are optional
 * .description("description")
 * .stateMachineRevisionId("stateMachineRevisionId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachineversion.html)
 */
public interface CfnStateMachineVersionProps {
  /**
   * An optional description of the state machine version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachineversion.html#cfn-stepfunctions-statemachineversion-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The Amazon Resource Name (ARN) of the state machine.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachineversion.html#cfn-stepfunctions-statemachineversion-statemachinearn)
   */
  public fun stateMachineArn(): String

  /**
   * Identifier for a state machine revision, which is an immutable, read-only snapshot of a state
   * machine’s definition and configuration.
   *
   * Only publish the state machine version if the current state machine's revision ID matches the
   * specified ID. Use this option to avoid publishing a version if the state machine has changed since
   * you last updated it.
   *
   * To specify the initial state machine revision, set the value as `INITIAL` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachineversion.html#cfn-stepfunctions-statemachineversion-statemachinerevisionid)
   */
  public fun stateMachineRevisionId(): String? = unwrap(this).getStateMachineRevisionId()

  /**
   * A builder for [CfnStateMachineVersionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description An optional description of the state machine version.
     */
    public fun description(description: String)

    /**
     * @param stateMachineArn The Amazon Resource Name (ARN) of the state machine. 
     */
    public fun stateMachineArn(stateMachineArn: String)

    /**
     * @param stateMachineRevisionId Identifier for a state machine revision, which is an immutable,
     * read-only snapshot of a state machine’s definition and configuration.
     * Only publish the state machine version if the current state machine's revision ID matches the
     * specified ID. Use this option to avoid publishing a version if the state machine has changed
     * since you last updated it.
     *
     * To specify the initial state machine revision, set the value as `INITIAL` .
     */
    public fun stateMachineRevisionId(stateMachineRevisionId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.CfnStateMachineVersionProps.Builder =
        software.amazon.awscdk.services.stepfunctions.CfnStateMachineVersionProps.builder()

    /**
     * @param description An optional description of the state machine version.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param stateMachineArn The Amazon Resource Name (ARN) of the state machine. 
     */
    override fun stateMachineArn(stateMachineArn: String) {
      cdkBuilder.stateMachineArn(stateMachineArn)
    }

    /**
     * @param stateMachineRevisionId Identifier for a state machine revision, which is an immutable,
     * read-only snapshot of a state machine’s definition and configuration.
     * Only publish the state machine version if the current state machine's revision ID matches the
     * specified ID. Use this option to avoid publishing a version if the state machine has changed
     * since you last updated it.
     *
     * To specify the initial state machine revision, set the value as `INITIAL` .
     */
    override fun stateMachineRevisionId(stateMachineRevisionId: String) {
      cdkBuilder.stateMachineRevisionId(stateMachineRevisionId)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.CfnStateMachineVersionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.stepfunctions.CfnStateMachineVersionProps,
  ) : CdkObject(cdkObject), CfnStateMachineVersionProps {
    /**
     * An optional description of the state machine version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachineversion.html#cfn-stepfunctions-statemachineversion-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The Amazon Resource Name (ARN) of the state machine.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-statemachineversion.html#cfn-stepfunctions-statemachineversion-statemachinearn)
     */
    override fun stateMachineArn(): String = unwrap(this).getStateMachineArn()

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
     */
    override fun stateMachineRevisionId(): String? = unwrap(this).getStateMachineRevisionId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnStateMachineVersionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.CfnStateMachineVersionProps):
        CfnStateMachineVersionProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnStateMachineVersionProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnStateMachineVersionProps):
        software.amazon.awscdk.services.stepfunctions.CfnStateMachineVersionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.CfnStateMachineVersionProps
  }
}
