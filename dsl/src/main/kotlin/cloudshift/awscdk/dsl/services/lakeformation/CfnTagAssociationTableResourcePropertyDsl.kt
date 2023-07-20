@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lakeformation

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lakeformation.CfnTagAssociation

@CdkDslMarker
public class CfnTagAssociationTableResourcePropertyDsl {
  private val cdkBuilder: CfnTagAssociation.TableResourceProperty.Builder =
      CfnTagAssociation.TableResourceProperty.builder()

  public fun catalogId(catalogId: String) {
    cdkBuilder.catalogId(catalogId)
  }

  public fun databaseName(databaseName: String) {
    cdkBuilder.databaseName(databaseName)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun tableWildcard(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.tableWildcard(builder.map)
  }

  public fun tableWildcard(tableWildcard: Any) {
    cdkBuilder.tableWildcard(tableWildcard)
  }

  public fun build(): CfnTagAssociation.TableResourceProperty = cdkBuilder.build()
}
