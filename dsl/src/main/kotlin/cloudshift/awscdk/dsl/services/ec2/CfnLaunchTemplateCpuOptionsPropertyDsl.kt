@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate

@CdkDslMarker
public class CfnLaunchTemplateCpuOptionsPropertyDsl {
  private val cdkBuilder: CfnLaunchTemplate.CpuOptionsProperty.Builder =
      CfnLaunchTemplate.CpuOptionsProperty.builder()

  /**
   * @param amdSevSnp Indicates whether to enable the instance for AMD SEV-SNP.
   * AMD SEV-SNP is supported with M6a, R6a, and C6a instance types only. For more information, see
   * [AMD SEV-SNP](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/sev-snp.html) .
   */
  public fun amdSevSnp(amdSevSnp: String) {
    cdkBuilder.amdSevSnp(amdSevSnp)
  }

  /**
   * @param coreCount The number of CPU cores for the instance.
   */
  public fun coreCount(coreCount: Number) {
    cdkBuilder.coreCount(coreCount)
  }

  /**
   * @param threadsPerCore The number of threads per CPU core.
   * To disable multithreading for the instance, specify a value of `1` . Otherwise, specify the
   * default value of `2` .
   */
  public fun threadsPerCore(threadsPerCore: Number) {
    cdkBuilder.threadsPerCore(threadsPerCore)
  }

  public fun build(): CfnLaunchTemplate.CpuOptionsProperty = cdkBuilder.build()
}
