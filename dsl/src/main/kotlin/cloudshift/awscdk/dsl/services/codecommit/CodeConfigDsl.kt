@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codecommit

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Unit
import software.amazon.awscdk.services.codecommit.CfnRepository
import software.amazon.awscdk.services.codecommit.CodeConfig

@CdkDslMarker
public class CodeConfigDsl {
  private val cdkBuilder: CodeConfig.Builder = CodeConfig.builder()

  /**
   * @param code represents the underlying code structure. 
   */
  public fun code(code: CfnRepositoryCodePropertyDsl.() -> Unit = {}) {
    val builder = CfnRepositoryCodePropertyDsl()
    builder.apply(code)
    cdkBuilder.code(builder.build())
  }

  /**
   * @param code represents the underlying code structure. 
   */
  public fun code(code: CfnRepository.CodeProperty) {
    cdkBuilder.code(code)
  }

  public fun build(): CodeConfig = cdkBuilder.build()
}
