@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.emr

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emr.CfnCluster

/**
 * The `HadoopJarStepConfig` property type specifies a job flow step consisting of a JAR file whose
 * main function will be executed.
 *
 * The main function submits a job for the cluster to execute as a step on the master node, and then
 * waits for the job to finish or fail before executing subsequent steps.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.emr.*;
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-cluster-hadoopjarstepconfig.html)
 */
@CdkDslMarker
public class CfnClusterHadoopJarStepConfigPropertyDsl {
    private val cdkBuilder: CfnCluster.HadoopJarStepConfigProperty.Builder =
        CfnCluster.HadoopJarStepConfigProperty.builder()

    private val _args: MutableList<String> = mutableListOf()

    private val _stepProperties: MutableList<Any> = mutableListOf()

    /**
     * @param args A list of command line arguments passed to the JAR file's main function when
     *   executed.
     */
    public fun args(vararg args: String) {
        _args.addAll(listOf(*args))
    }

    /**
     * @param args A list of command line arguments passed to the JAR file's main function when
     *   executed.
     */
    public fun args(args: Collection<String>) {
        _args.addAll(args)
    }

    /** @param jar A path to a JAR file run during the step. */
    public fun jar(jar: String) {
        cdkBuilder.jar(jar)
    }

    /**
     * @param mainClass The name of the main class in the specified Java file. If not specified, the
     *   JAR file should specify a Main-Class in its manifest file.
     */
    public fun mainClass(mainClass: String) {
        cdkBuilder.mainClass(mainClass)
    }

    /**
     * @param stepProperties A list of Java properties that are set when the step runs. You can use
     *   these properties to pass key-value pairs to your main function.
     */
    public fun stepProperties(vararg stepProperties: Any) {
        _stepProperties.addAll(listOf(*stepProperties))
    }

    /**
     * @param stepProperties A list of Java properties that are set when the step runs. You can use
     *   these properties to pass key-value pairs to your main function.
     */
    public fun stepProperties(stepProperties: Collection<Any>) {
        _stepProperties.addAll(stepProperties)
    }

    /**
     * @param stepProperties A list of Java properties that are set when the step runs. You can use
     *   these properties to pass key-value pairs to your main function.
     */
    public fun stepProperties(stepProperties: IResolvable) {
        cdkBuilder.stepProperties(stepProperties)
    }

    public fun build(): CfnCluster.HadoopJarStepConfigProperty {
        if (_args.isNotEmpty()) cdkBuilder.args(_args)
        if (_stepProperties.isNotEmpty()) cdkBuilder.stepProperties(_stepProperties)
        return cdkBuilder.build()
    }
}
