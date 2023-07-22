@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.cloudassembly.schema

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.cloudassembly.schema.IntegManifest
import software.amazon.awscdk.cloudassembly.schema.TestCase

@CdkDslMarker
public class IntegManifestDsl {
  private val cdkBuilder: IntegManifest.Builder = IntegManifest.builder()

  /**
   * @param enableLookups Enable lookups for this test.
   * If lookups are enabled
   * then `stackUpdateWorkflow` must be set to false.
   * Lookups should only be enabled when you are explicitely testing
   * lookups.
   */
  public fun enableLookups(enableLookups: Boolean) {
    cdkBuilder.enableLookups(enableLookups)
  }

  /**
   * @param synthContext Additional context to use when performing a synth.
   * Any context provided here will override
   * any default context
   */
  public fun synthContext(synthContext: Map<String, String>) {
    cdkBuilder.synthContext(synthContext)
  }

  /**
   * @param testCases test cases. 
   */
  public fun testCases(testCases: Map<String, TestCase>) {
    cdkBuilder.testCases(testCases)
  }

  /**
   * @param version Version of the manifest. 
   */
  public fun version(version: String) {
    cdkBuilder.version(version)
  }

  public fun build(): IntegManifest = cdkBuilder.build()
}
