@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.databrew

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.databrew.CfnJob

@CdkDslMarker
public class CfnJobS3TableOutputOptionsPropertyDsl {
  private val cdkBuilder: CfnJob.S3TableOutputOptionsProperty.Builder =
      CfnJob.S3TableOutputOptionsProperty.builder()

  /**
   * @param location Represents an Amazon S3 location (bucket name and object key) where DataBrew
   * can write output from a job. 
   */
  public fun location(location: IResolvable) {
    cdkBuilder.location(location)
  }

  /**
   * @param location Represents an Amazon S3 location (bucket name and object key) where DataBrew
   * can write output from a job. 
   */
  public fun location(location: CfnJob.S3LocationProperty) {
    cdkBuilder.location(location)
  }

  public fun build(): CfnJob.S3TableOutputOptionsProperty = cdkBuilder.build()
}
