@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.emr

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Use `Step` to specify a cluster (job flow) step, which runs only on the master node.
 *
 * Steps are used to submit data processing jobs to a cluster.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.emr.*;
 * CfnStep cfnStep = CfnStep.Builder.create(this, "MyCfnStep")
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
public open class CfnStep internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.emr.CfnStep,
) : CfnResource(cdkObject), IInspectable {
  /**
   * This specifies what action to take when the cluster step fails.
   */
  public open fun actionOnFailure(): String = unwrap(this).getActionOnFailure()

  /**
   * This specifies what action to take when the cluster step fails.
   */
  public open fun actionOnFailure(`value`: String) {
    unwrap(this).setActionOnFailure(`value`)
  }

  /**
   * The identifier of the cluster step.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The `HadoopJarStepConfig` property type specifies a job flow step consisting of a JAR file
   * whose main function will be executed.
   */
  public open fun hadoopJarStep(): Any = unwrap(this).getHadoopJarStep()

  /**
   * The `HadoopJarStepConfig` property type specifies a job flow step consisting of a JAR file
   * whose main function will be executed.
   */
  public open fun hadoopJarStep(`value`: IResolvable) {
    unwrap(this).setHadoopJarStep(`value`.let(IResolvable::unwrap))
  }

  /**
   * The `HadoopJarStepConfig` property type specifies a job flow step consisting of a JAR file
   * whose main function will be executed.
   */
  public open fun hadoopJarStep(`value`: HadoopJarStepConfigProperty) {
    unwrap(this).setHadoopJarStep(`value`.let(HadoopJarStepConfigProperty::unwrap))
  }

  /**
   * The `HadoopJarStepConfig` property type specifies a job flow step consisting of a JAR file
   * whose main function will be executed.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1d15b8c5ae9322c155e09fd18a3f314e5fb0413672a89ab863cfc45bba04e943")
  public open fun hadoopJarStep(`value`: HadoopJarStepConfigProperty.Builder.() -> Unit): Unit =
      hadoopJarStep(HadoopJarStepConfigProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * A string that uniquely identifies the cluster (job flow).
   */
  public open fun jobFlowId(): String = unwrap(this).getJobFlowId()

  /**
   * A string that uniquely identifies the cluster (job flow).
   */
  public open fun jobFlowId(`value`: String) {
    unwrap(this).setJobFlowId(`value`)
  }

  /**
   * The name of the cluster step.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the cluster step.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.emr.CfnStep].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * This specifies what action to take when the cluster step fails.
     *
     * Possible values are `CANCEL_AND_WAIT` and `CONTINUE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-step.html#cfn-emr-step-actiononfailure)
     * @param actionOnFailure This specifies what action to take when the cluster step fails. 
     */
    public fun actionOnFailure(actionOnFailure: String)

    /**
     * The `HadoopJarStepConfig` property type specifies a job flow step consisting of a JAR file
     * whose main function will be executed.
     *
     * The main function submits a job for the cluster to execute as a step on the master node, and
     * then waits for the job to finish or fail before executing subsequent steps.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-step.html#cfn-emr-step-hadoopjarstep)
     * @param hadoopJarStep The `HadoopJarStepConfig` property type specifies a job flow step
     * consisting of a JAR file whose main function will be executed. 
     */
    public fun hadoopJarStep(hadoopJarStep: IResolvable)

    /**
     * The `HadoopJarStepConfig` property type specifies a job flow step consisting of a JAR file
     * whose main function will be executed.
     *
     * The main function submits a job for the cluster to execute as a step on the master node, and
     * then waits for the job to finish or fail before executing subsequent steps.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-step.html#cfn-emr-step-hadoopjarstep)
     * @param hadoopJarStep The `HadoopJarStepConfig` property type specifies a job flow step
     * consisting of a JAR file whose main function will be executed. 
     */
    public fun hadoopJarStep(hadoopJarStep: HadoopJarStepConfigProperty)

    /**
     * The `HadoopJarStepConfig` property type specifies a job flow step consisting of a JAR file
     * whose main function will be executed.
     *
     * The main function submits a job for the cluster to execute as a step on the master node, and
     * then waits for the job to finish or fail before executing subsequent steps.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-step.html#cfn-emr-step-hadoopjarstep)
     * @param hadoopJarStep The `HadoopJarStepConfig` property type specifies a job flow step
     * consisting of a JAR file whose main function will be executed. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6d72595de5e5e291d59e6ffe4185f7b5fae105fab39fe862ae0898e1d644bb0f")
    public fun hadoopJarStep(hadoopJarStep: HadoopJarStepConfigProperty.Builder.() -> Unit)

    /**
     * A string that uniquely identifies the cluster (job flow).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-step.html#cfn-emr-step-jobflowid)
     * @param jobFlowId A string that uniquely identifies the cluster (job flow). 
     */
    public fun jobFlowId(jobFlowId: String)

    /**
     * The name of the cluster step.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-step.html#cfn-emr-step-name)
     * @param name The name of the cluster step. 
     */
    public fun name(name: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.emr.CfnStep.Builder =
        software.amazon.awscdk.services.emr.CfnStep.Builder.create(scope, id)

    /**
     * This specifies what action to take when the cluster step fails.
     *
     * Possible values are `CANCEL_AND_WAIT` and `CONTINUE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-step.html#cfn-emr-step-actiononfailure)
     * @param actionOnFailure This specifies what action to take when the cluster step fails. 
     */
    override fun actionOnFailure(actionOnFailure: String) {
      cdkBuilder.actionOnFailure(actionOnFailure)
    }

    /**
     * The `HadoopJarStepConfig` property type specifies a job flow step consisting of a JAR file
     * whose main function will be executed.
     *
     * The main function submits a job for the cluster to execute as a step on the master node, and
     * then waits for the job to finish or fail before executing subsequent steps.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-step.html#cfn-emr-step-hadoopjarstep)
     * @param hadoopJarStep The `HadoopJarStepConfig` property type specifies a job flow step
     * consisting of a JAR file whose main function will be executed. 
     */
    override fun hadoopJarStep(hadoopJarStep: IResolvable) {
      cdkBuilder.hadoopJarStep(hadoopJarStep.let(IResolvable::unwrap))
    }

    /**
     * The `HadoopJarStepConfig` property type specifies a job flow step consisting of a JAR file
     * whose main function will be executed.
     *
     * The main function submits a job for the cluster to execute as a step on the master node, and
     * then waits for the job to finish or fail before executing subsequent steps.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-step.html#cfn-emr-step-hadoopjarstep)
     * @param hadoopJarStep The `HadoopJarStepConfig` property type specifies a job flow step
     * consisting of a JAR file whose main function will be executed. 
     */
    override fun hadoopJarStep(hadoopJarStep: HadoopJarStepConfigProperty) {
      cdkBuilder.hadoopJarStep(hadoopJarStep.let(HadoopJarStepConfigProperty::unwrap))
    }

    /**
     * The `HadoopJarStepConfig` property type specifies a job flow step consisting of a JAR file
     * whose main function will be executed.
     *
     * The main function submits a job for the cluster to execute as a step on the master node, and
     * then waits for the job to finish or fail before executing subsequent steps.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-step.html#cfn-emr-step-hadoopjarstep)
     * @param hadoopJarStep The `HadoopJarStepConfig` property type specifies a job flow step
     * consisting of a JAR file whose main function will be executed. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6d72595de5e5e291d59e6ffe4185f7b5fae105fab39fe862ae0898e1d644bb0f")
    override fun hadoopJarStep(hadoopJarStep: HadoopJarStepConfigProperty.Builder.() -> Unit): Unit
        = hadoopJarStep(HadoopJarStepConfigProperty(hadoopJarStep))

    /**
     * A string that uniquely identifies the cluster (job flow).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-step.html#cfn-emr-step-jobflowid)
     * @param jobFlowId A string that uniquely identifies the cluster (job flow). 
     */
    override fun jobFlowId(jobFlowId: String) {
      cdkBuilder.jobFlowId(jobFlowId)
    }

    /**
     * The name of the cluster step.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-step.html#cfn-emr-step-name)
     * @param name The name of the cluster step. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.emr.CfnStep = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.emr.CfnStep.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnStep {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnStep(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnStep): CfnStep =
        CfnStep(cdkObject)

    internal fun unwrap(wrapped: CfnStep): software.amazon.awscdk.services.emr.CfnStep =
        wrapped.cdkObject
  }

  /**
   * A job flow step consisting of a JAR file whose main function will be executed.
   *
   * The main function submits a job for Hadoop to execute and waits for the job to finish or fail.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.emr.*;
   * HadoopJarStepConfigProperty hadoopJarStepConfigProperty = HadoopJarStepConfigProperty.builder()
   * .jar("jar")
   * // the properties below are optional
   * .args(List.of("args"))
   * .mainClass("mainClass")
   * .stepProperties(List.of(KeyValueProperty.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-step-hadoopjarstepconfig.html)
   */
  public interface HadoopJarStepConfigProperty {
    /**
     * A list of command line arguments passed to the JAR file's main function when executed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-step-hadoopjarstepconfig.html#cfn-emr-step-hadoopjarstepconfig-args)
     */
    public fun args(): List<String> = unwrap(this).getArgs() ?: emptyList()

    /**
     * A path to a JAR file run during the step.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-step-hadoopjarstepconfig.html#cfn-emr-step-hadoopjarstepconfig-jar)
     */
    public fun jar(): String

    /**
     * The name of the main class in the specified Java file.
     *
     * If not specified, the JAR file should specify a Main-Class in its manifest file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-step-hadoopjarstepconfig.html#cfn-emr-step-hadoopjarstepconfig-mainclass)
     */
    public fun mainClass(): String? = unwrap(this).getMainClass()

    /**
     * A list of Java properties that are set when the step runs.
     *
     * You can use these properties to pass key value pairs to your main function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-step-hadoopjarstepconfig.html#cfn-emr-step-hadoopjarstepconfig-stepproperties)
     */
    public fun stepProperties(): Any? = unwrap(this).getStepProperties()

    /**
     * A builder for [HadoopJarStepConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param args A list of command line arguments passed to the JAR file's main function when
       * executed.
       */
      public fun args(args: List<String>)

      /**
       * @param args A list of command line arguments passed to the JAR file's main function when
       * executed.
       */
      public fun args(vararg args: String)

      /**
       * @param jar A path to a JAR file run during the step. 
       */
      public fun jar(jar: String)

      /**
       * @param mainClass The name of the main class in the specified Java file.
       * If not specified, the JAR file should specify a Main-Class in its manifest file.
       */
      public fun mainClass(mainClass: String)

      /**
       * @param stepProperties A list of Java properties that are set when the step runs.
       * You can use these properties to pass key value pairs to your main function.
       */
      public fun stepProperties(stepProperties: IResolvable)

      /**
       * @param stepProperties A list of Java properties that are set when the step runs.
       * You can use these properties to pass key value pairs to your main function.
       */
      public fun stepProperties(stepProperties: List<Any>)

      /**
       * @param stepProperties A list of Java properties that are set when the step runs.
       * You can use these properties to pass key value pairs to your main function.
       */
      public fun stepProperties(vararg stepProperties: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnStep.HadoopJarStepConfigProperty.Builder =
          software.amazon.awscdk.services.emr.CfnStep.HadoopJarStepConfigProperty.builder()

      /**
       * @param args A list of command line arguments passed to the JAR file's main function when
       * executed.
       */
      override fun args(args: List<String>) {
        cdkBuilder.args(args)
      }

      /**
       * @param args A list of command line arguments passed to the JAR file's main function when
       * executed.
       */
      override fun args(vararg args: String): Unit = args(args.toList())

      /**
       * @param jar A path to a JAR file run during the step. 
       */
      override fun jar(jar: String) {
        cdkBuilder.jar(jar)
      }

      /**
       * @param mainClass The name of the main class in the specified Java file.
       * If not specified, the JAR file should specify a Main-Class in its manifest file.
       */
      override fun mainClass(mainClass: String) {
        cdkBuilder.mainClass(mainClass)
      }

      /**
       * @param stepProperties A list of Java properties that are set when the step runs.
       * You can use these properties to pass key value pairs to your main function.
       */
      override fun stepProperties(stepProperties: IResolvable) {
        cdkBuilder.stepProperties(stepProperties.let(IResolvable::unwrap))
      }

      /**
       * @param stepProperties A list of Java properties that are set when the step runs.
       * You can use these properties to pass key value pairs to your main function.
       */
      override fun stepProperties(stepProperties: List<Any>) {
        cdkBuilder.stepProperties(stepProperties)
      }

      /**
       * @param stepProperties A list of Java properties that are set when the step runs.
       * You can use these properties to pass key value pairs to your main function.
       */
      override fun stepProperties(vararg stepProperties: Any): Unit =
          stepProperties(stepProperties.toList())

      public fun build(): software.amazon.awscdk.services.emr.CfnStep.HadoopJarStepConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emr.CfnStep.HadoopJarStepConfigProperty,
    ) : CdkObject(cdkObject), HadoopJarStepConfigProperty {
      /**
       * A list of command line arguments passed to the JAR file's main function when executed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-step-hadoopjarstepconfig.html#cfn-emr-step-hadoopjarstepconfig-args)
       */
      override fun args(): List<String> = unwrap(this).getArgs() ?: emptyList()

      /**
       * A path to a JAR file run during the step.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-step-hadoopjarstepconfig.html#cfn-emr-step-hadoopjarstepconfig-jar)
       */
      override fun jar(): String = unwrap(this).getJar()

      /**
       * The name of the main class in the specified Java file.
       *
       * If not specified, the JAR file should specify a Main-Class in its manifest file.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-step-hadoopjarstepconfig.html#cfn-emr-step-hadoopjarstepconfig-mainclass)
       */
      override fun mainClass(): String? = unwrap(this).getMainClass()

      /**
       * A list of Java properties that are set when the step runs.
       *
       * You can use these properties to pass key value pairs to your main function.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-step-hadoopjarstepconfig.html#cfn-emr-step-hadoopjarstepconfig-stepproperties)
       */
      override fun stepProperties(): Any? = unwrap(this).getStepProperties()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HadoopJarStepConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnStep.HadoopJarStepConfigProperty):
          HadoopJarStepConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HadoopJarStepConfigProperty):
          software.amazon.awscdk.services.emr.CfnStep.HadoopJarStepConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.emr.CfnStep.HadoopJarStepConfigProperty
    }
  }

  /**
   * `KeyValue` is a subproperty of the `HadoopJarStepConfig` property type.
   *
   * `KeyValue` is used to pass parameters to a step.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.emr.*;
   * KeyValueProperty keyValueProperty = KeyValueProperty.builder()
   * .key("key")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-step-keyvalue.html)
   */
  public interface KeyValueProperty {
    /**
     * The unique identifier of a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-step-keyvalue.html#cfn-emr-step-keyvalue-key)
     */
    public fun key(): String? = unwrap(this).getKey()

    /**
     * The value part of the identified key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-step-keyvalue.html#cfn-emr-step-keyvalue-value)
     */
    public fun `value`(): String? = unwrap(this).getValue()

    /**
     * A builder for [KeyValueProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key The unique identifier of a key-value pair.
       */
      public fun key(key: String)

      /**
       * @param value The value part of the identified key.
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.emr.CfnStep.KeyValueProperty.Builder =
          software.amazon.awscdk.services.emr.CfnStep.KeyValueProperty.builder()

      /**
       * @param key The unique identifier of a key-value pair.
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param value The value part of the identified key.
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.emr.CfnStep.KeyValueProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.emr.CfnStep.KeyValueProperty,
    ) : CdkObject(cdkObject), KeyValueProperty {
      /**
       * The unique identifier of a key-value pair.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-step-keyvalue.html#cfn-emr-step-keyvalue-key)
       */
      override fun key(): String? = unwrap(this).getKey()

      /**
       * The value part of the identified key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-step-keyvalue.html#cfn-emr-step-keyvalue-value)
       */
      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): KeyValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnStep.KeyValueProperty):
          KeyValueProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KeyValueProperty):
          software.amazon.awscdk.services.emr.CfnStep.KeyValueProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.emr.CfnStep.KeyValueProperty
    }
  }
}
