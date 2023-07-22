@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.fsx

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.fsx.CfnFileSystem

/**
 * The configuration object for mounting a file system.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.fsx.*;
 * NfsExportsProperty nfsExportsProperty = NfsExportsProperty.builder()
 * .clientConfigurations(List.of(ClientConfigurationsProperty.builder()
 * .clients("clients")
 * .options(List.of("options"))
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-nfsexports.html)
 */
@CdkDslMarker
public class CfnFileSystemNfsExportsPropertyDsl {
  private val cdkBuilder: CfnFileSystem.NfsExportsProperty.Builder =
      CfnFileSystem.NfsExportsProperty.builder()

  private val _clientConfigurations: MutableList<Any> = mutableListOf()

  /**
   * @param clientConfigurations A list of configuration objects that contain the client and options
   * for mounting the OpenZFS file system.
   */
  public fun clientConfigurations(vararg clientConfigurations: Any) {
    _clientConfigurations.addAll(listOf(*clientConfigurations))
  }

  /**
   * @param clientConfigurations A list of configuration objects that contain the client and options
   * for mounting the OpenZFS file system.
   */
  public fun clientConfigurations(clientConfigurations: Collection<Any>) {
    _clientConfigurations.addAll(clientConfigurations)
  }

  /**
   * @param clientConfigurations A list of configuration objects that contain the client and options
   * for mounting the OpenZFS file system.
   */
  public fun clientConfigurations(clientConfigurations: IResolvable) {
    cdkBuilder.clientConfigurations(clientConfigurations)
  }

  public fun build(): CfnFileSystem.NfsExportsProperty {
    if(_clientConfigurations.isNotEmpty()) cdkBuilder.clientConfigurations(_clientConfigurations)
    return cdkBuilder.build()
  }
}
