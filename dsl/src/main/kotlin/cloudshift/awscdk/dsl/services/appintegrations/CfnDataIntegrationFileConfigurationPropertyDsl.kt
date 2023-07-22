@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appintegrations

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.appintegrations.CfnDataIntegration

/**
 * The configuration for what files should be pulled from the source.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appintegrations.*;
 * Object filters;
 * FileConfigurationProperty fileConfigurationProperty = FileConfigurationProperty.builder()
 * .folders(List.of("folders"))
 * // the properties below are optional
 * .filters(filters)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appintegrations-dataintegration-fileconfiguration.html)
 */
@CdkDslMarker
public class CfnDataIntegrationFileConfigurationPropertyDsl {
  private val cdkBuilder: CfnDataIntegration.FileConfigurationProperty.Builder =
      CfnDataIntegration.FileConfigurationProperty.builder()

  private val _folders: MutableList<String> = mutableListOf()

  /**
   * @param filters Restrictions for what files should be pulled from the source.
   */
  public fun filters(filters: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(filters)
    cdkBuilder.filters(builder.map)
  }

  /**
   * @param filters Restrictions for what files should be pulled from the source.
   */
  public fun filters(filters: Any) {
    cdkBuilder.filters(filters)
  }

  /**
   * @param folders Identifiers for the source folders to pull all files from recursively. 
   */
  public fun folders(vararg folders: String) {
    _folders.addAll(listOf(*folders))
  }

  /**
   * @param folders Identifiers for the source folders to pull all files from recursively. 
   */
  public fun folders(folders: Collection<String>) {
    _folders.addAll(folders)
  }

  public fun build(): CfnDataIntegration.FileConfigurationProperty {
    if(_folders.isNotEmpty()) cdkBuilder.folders(_folders)
    return cdkBuilder.build()
  }
}
