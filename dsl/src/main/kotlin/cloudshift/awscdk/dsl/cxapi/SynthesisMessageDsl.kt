@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.cxapi

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.cloudassembly.schema.MetadataEntryDsl
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.cloudassembly.schema.MetadataEntry
import software.amazon.awscdk.cxapi.SynthesisMessage
import software.amazon.awscdk.cxapi.SynthesisMessageLevel

@CdkDslMarker
public class SynthesisMessageDsl {
  private val cdkBuilder: SynthesisMessage.Builder = SynthesisMessage.builder()

  /**
   * @param entry the value to be set. 
   */
  public fun entry(entry: MetadataEntryDsl.() -> Unit = {}) {
    val builder = MetadataEntryDsl()
    builder.apply(entry)
    cdkBuilder.entry(builder.build())
  }

  /**
   * @param entry the value to be set. 
   */
  public fun entry(entry: MetadataEntry) {
    cdkBuilder.entry(entry)
  }

  /**
   * @param id the value to be set. 
   */
  public fun id(id: String) {
    cdkBuilder.id(id)
  }

  /**
   * @param level the value to be set. 
   */
  public fun level(level: SynthesisMessageLevel) {
    cdkBuilder.level(level)
  }

  public fun build(): SynthesisMessage = cdkBuilder.build()
}
