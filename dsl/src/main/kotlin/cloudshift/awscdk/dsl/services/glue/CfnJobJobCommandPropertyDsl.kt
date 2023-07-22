@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.glue.CfnJob

/**
 * Specifies code executed when a job is run.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * JobCommandProperty jobCommandProperty = JobCommandProperty.builder()
 * .name("name")
 * .pythonVersion("pythonVersion")
 * .runtime("runtime")
 * .scriptLocation("scriptLocation")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-jobcommand.html)
 */
@CdkDslMarker
public class CfnJobJobCommandPropertyDsl {
  private val cdkBuilder: CfnJob.JobCommandProperty.Builder = CfnJob.JobCommandProperty.builder()

  /**
   * @param name The name of the job command.
   * For an Apache Spark ETL job, this must be `glueetl` . For a Python shell job, it must be
   * `pythonshell` . For an Apache Spark streaming ETL job, this must be `gluestreaming` . For a Ray
   * job, this must be `glueray` .
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param pythonVersion The Python version being used to execute a Python shell job.
   * Allowed values are 3 or 3.9. Version 2 is deprecated.
   */
  public fun pythonVersion(pythonVersion: String) {
    cdkBuilder.pythonVersion(pythonVersion)
  }

  /**
   * @param runtime In Ray jobs, Runtime is used to specify the versions of Ray, Python and
   * additional libraries available in your environment.
   * This field is not used in other job types. For supported runtime environment values, see
   * [Working with Ray jobs](https://docs.aws.amazon.com/glue/latest/dg/ray-jobs-section.html) in the
   * AWS Glue Developer Guide.
   */
  public fun runtime(runtime: String) {
    cdkBuilder.runtime(runtime)
  }

  /**
   * @param scriptLocation Specifies the Amazon Simple Storage Service (Amazon S3) path to a script
   * that executes a job (required).
   */
  public fun scriptLocation(scriptLocation: String) {
    cdkBuilder.scriptLocation(scriptLocation)
  }

  public fun build(): CfnJob.JobCommandProperty = cdkBuilder.build()
}
