@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appstream

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appstream.CfnAppBlock

@CdkDslMarker
public class CfnAppBlockScriptDetailsPropertyDsl {
  private val cdkBuilder: CfnAppBlock.ScriptDetailsProperty.Builder =
      CfnAppBlock.ScriptDetailsProperty.builder()

  /**
   * @param executableParameters The parameters used in the run path for the script.
   */
  public fun executableParameters(executableParameters: String) {
    cdkBuilder.executableParameters(executableParameters)
  }

  /**
   * @param executablePath The run path for the script. 
   */
  public fun executablePath(executablePath: String) {
    cdkBuilder.executablePath(executablePath)
  }

  /**
   * @param scriptS3Location The S3 object location of the script. 
   */
  public fun scriptS3Location(scriptS3Location: IResolvable) {
    cdkBuilder.scriptS3Location(scriptS3Location)
  }

  /**
   * @param scriptS3Location The S3 object location of the script. 
   */
  public fun scriptS3Location(scriptS3Location: CfnAppBlock.S3LocationProperty) {
    cdkBuilder.scriptS3Location(scriptS3Location)
  }

  /**
   * @param timeoutInSeconds The run timeout, in seconds, for the script. 
   */
  public fun timeoutInSeconds(timeoutInSeconds: Number) {
    cdkBuilder.timeoutInSeconds(timeoutInSeconds)
  }

  public fun build(): CfnAppBlock.ScriptDetailsProperty = cdkBuilder.build()
}
