@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.emr

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnStep`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.emr.*;
 * CfnStepProps cfnStepProps = CfnStepProps.builder()
 * .actionOnFailure("actionOnFailure")
 * .hadoopJarStep(HadoopJarStepConfigProperty.builder()
 * .jar("jar")
 * // the properties below are optional
 * .args(List.of("args"))
 * .mainClass("mainClass")
 * .stepProperties(List.of(KeyValueProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build())
 * .jobFlowId("jobFlowId")
 * .name("name")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-step.html)
 */
public interface CfnStepProps {
  /**
   * This specifies what action to take when the cluster step fails.
   *
   * Possible values are `CANCEL_AND_WAIT` and `CONTINUE` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-step.html#cfn-emr-step-actiononfailure)
   */
  public fun actionOnFailure(): String

  /**
   * The `HadoopJarStepConfig` property type specifies a job flow step consisting of a JAR file
   * whose main function will be executed.
   *
   * The main function submits a job for the cluster to execute as a step on the master node, and
   * then waits for the job to finish or fail before executing subsequent steps.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-step.html#cfn-emr-step-hadoopjarstep)
   */
  public fun hadoopJarStep(): Any

  /**
   * A string that uniquely identifies the cluster (job flow).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-step.html#cfn-emr-step-jobflowid)
   */
  public fun jobFlowId(): String

  /**
   * The name of the cluster step.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-step.html#cfn-emr-step-name)
   */
  public fun name(): String

  /**
   * A builder for [CfnStepProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param actionOnFailure This specifies what action to take when the cluster step fails. 
     * Possible values are `CANCEL_AND_WAIT` and `CONTINUE` .
     */
    public fun actionOnFailure(actionOnFailure: String)

    /**
     * @param hadoopJarStep The `HadoopJarStepConfig` property type specifies a job flow step
     * consisting of a JAR file whose main function will be executed. 
     * The main function submits a job for the cluster to execute as a step on the master node, and
     * then waits for the job to finish or fail before executing subsequent steps.
     */
    public fun hadoopJarStep(hadoopJarStep: IResolvable)

    /**
     * @param hadoopJarStep The `HadoopJarStepConfig` property type specifies a job flow step
     * consisting of a JAR file whose main function will be executed. 
     * The main function submits a job for the cluster to execute as a step on the master node, and
     * then waits for the job to finish or fail before executing subsequent steps.
     */
    public fun hadoopJarStep(hadoopJarStep: CfnStep.HadoopJarStepConfigProperty)

    /**
     * @param hadoopJarStep The `HadoopJarStepConfig` property type specifies a job flow step
     * consisting of a JAR file whose main function will be executed. 
     * The main function submits a job for the cluster to execute as a step on the master node, and
     * then waits for the job to finish or fail before executing subsequent steps.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("13004e87498c75b024f431388d737d13eb5dfa0ce703e7af122c0b5caf1914d4")
    public fun hadoopJarStep(hadoopJarStep: CfnStep.HadoopJarStepConfigProperty.Builder.() -> Unit)

    /**
     * @param jobFlowId A string that uniquely identifies the cluster (job flow). 
     */
    public fun jobFlowId(jobFlowId: String)

    /**
     * @param name The name of the cluster step. 
     */
    public fun name(name: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.emr.CfnStepProps.Builder =
        software.amazon.awscdk.services.emr.CfnStepProps.builder()

    /**
     * @param actionOnFailure This specifies what action to take when the cluster step fails. 
     * Possible values are `CANCEL_AND_WAIT` and `CONTINUE` .
     */
    override fun actionOnFailure(actionOnFailure: String) {
      cdkBuilder.actionOnFailure(actionOnFailure)
    }

    /**
     * @param hadoopJarStep The `HadoopJarStepConfig` property type specifies a job flow step
     * consisting of a JAR file whose main function will be executed. 
     * The main function submits a job for the cluster to execute as a step on the master node, and
     * then waits for the job to finish or fail before executing subsequent steps.
     */
    override fun hadoopJarStep(hadoopJarStep: IResolvable) {
      cdkBuilder.hadoopJarStep(hadoopJarStep.let(IResolvable::unwrap))
    }

    /**
     * @param hadoopJarStep The `HadoopJarStepConfig` property type specifies a job flow step
     * consisting of a JAR file whose main function will be executed. 
     * The main function submits a job for the cluster to execute as a step on the master node, and
     * then waits for the job to finish or fail before executing subsequent steps.
     */
    override fun hadoopJarStep(hadoopJarStep: CfnStep.HadoopJarStepConfigProperty) {
      cdkBuilder.hadoopJarStep(hadoopJarStep.let(CfnStep.HadoopJarStepConfigProperty::unwrap))
    }

    /**
     * @param hadoopJarStep The `HadoopJarStepConfig` property type specifies a job flow step
     * consisting of a JAR file whose main function will be executed. 
     * The main function submits a job for the cluster to execute as a step on the master node, and
     * then waits for the job to finish or fail before executing subsequent steps.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("13004e87498c75b024f431388d737d13eb5dfa0ce703e7af122c0b5caf1914d4")
    override
        fun hadoopJarStep(hadoopJarStep: CfnStep.HadoopJarStepConfigProperty.Builder.() -> Unit):
        Unit = hadoopJarStep(CfnStep.HadoopJarStepConfigProperty(hadoopJarStep))

    /**
     * @param jobFlowId A string that uniquely identifies the cluster (job flow). 
     */
    override fun jobFlowId(jobFlowId: String) {
      cdkBuilder.jobFlowId(jobFlowId)
    }

    /**
     * @param name The name of the cluster step. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.emr.CfnStepProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.emr.CfnStepProps,
  ) : CdkObject(cdkObject), CfnStepProps {
    /**
     * This specifies what action to take when the cluster step fails.
     *
     * Possible values are `CANCEL_AND_WAIT` and `CONTINUE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-step.html#cfn-emr-step-actiononfailure)
     */
    override fun actionOnFailure(): String = unwrap(this).getActionOnFailure()

    /**
     * The `HadoopJarStepConfig` property type specifies a job flow step consisting of a JAR file
     * whose main function will be executed.
     *
     * The main function submits a job for the cluster to execute as a step on the master node, and
     * then waits for the job to finish or fail before executing subsequent steps.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-step.html#cfn-emr-step-hadoopjarstep)
     */
    override fun hadoopJarStep(): Any = unwrap(this).getHadoopJarStep()

    /**
     * A string that uniquely identifies the cluster (job flow).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-step.html#cfn-emr-step-jobflowid)
     */
    override fun jobFlowId(): String = unwrap(this).getJobFlowId()

    /**
     * The name of the cluster step.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-step.html#cfn-emr-step-name)
     */
    override fun name(): String = unwrap(this).getName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnStepProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnStepProps): CfnStepProps =
        CdkObjectWrappers.wrap(cdkObject) as? CfnStepProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnStepProps): software.amazon.awscdk.services.emr.CfnStepProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.emr.CfnStepProps
  }
}
