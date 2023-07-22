@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apprunner

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apprunner.CfnService

@CdkDslMarker
public class CfnServiceCodeConfigurationPropertyDsl {
  private val cdkBuilder: CfnService.CodeConfigurationProperty.Builder =
      CfnService.CodeConfigurationProperty.builder()

  /**
   * @param codeConfigurationValues The basic configuration for building and running the App Runner
   * service.
   * Use it to quickly launch an App Runner service without providing a `apprunner.yaml` file in the
   * source code repository (or ignoring the file if it exists).
   */
  public fun codeConfigurationValues(codeConfigurationValues: IResolvable) {
    cdkBuilder.codeConfigurationValues(codeConfigurationValues)
  }

  /**
   * @param codeConfigurationValues The basic configuration for building and running the App Runner
   * service.
   * Use it to quickly launch an App Runner service without providing a `apprunner.yaml` file in the
   * source code repository (or ignoring the file if it exists).
   */
  public
      fun codeConfigurationValues(codeConfigurationValues: CfnService.CodeConfigurationValuesProperty) {
    cdkBuilder.codeConfigurationValues(codeConfigurationValues)
  }

  /**
   * @param configurationSource The source of the App Runner configuration. Values are interpreted
   * as follows:. 
   * * `REPOSITORY` – App Runner reads configuration values from the `apprunner.yaml` file in the
   * source code repository and ignores `CodeConfigurationValues` .
   * * `API` – App Runner uses configuration values provided in `CodeConfigurationValues` and
   * ignores the `apprunner.yaml` file in the source code repository.
   */
  public fun configurationSource(configurationSource: String) {
    cdkBuilder.configurationSource(configurationSource)
  }

  public fun build(): CfnService.CodeConfigurationProperty = cdkBuilder.build()
}
