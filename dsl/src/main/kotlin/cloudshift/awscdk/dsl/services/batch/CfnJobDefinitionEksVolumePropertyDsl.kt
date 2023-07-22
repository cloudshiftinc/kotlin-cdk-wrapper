@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.batch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.batch.CfnJobDefinition

@CdkDslMarker
public class CfnJobDefinitionEksVolumePropertyDsl {
  private val cdkBuilder: CfnJobDefinition.EksVolumeProperty.Builder =
      CfnJobDefinition.EksVolumeProperty.builder()

  /**
   * @param emptyDir Specifies the configuration of a Kubernetes `emptyDir` volume.
   * For more information, see
   * [emptyDir](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/storage/volumes/#emptydir)
   * in the *Kubernetes documentation* .
   */
  public fun emptyDir(emptyDir: IResolvable) {
    cdkBuilder.emptyDir(emptyDir)
  }

  /**
   * @param emptyDir Specifies the configuration of a Kubernetes `emptyDir` volume.
   * For more information, see
   * [emptyDir](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/storage/volumes/#emptydir)
   * in the *Kubernetes documentation* .
   */
  public fun emptyDir(emptyDir: CfnJobDefinition.EmptyDirProperty) {
    cdkBuilder.emptyDir(emptyDir)
  }

  /**
   * @param hostPath Specifies the configuration of a Kubernetes `hostPath` volume.
   * For more information, see
   * [hostPath](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/storage/volumes/#hostpath)
   * in the *Kubernetes documentation* .
   */
  public fun hostPath(hostPath: IResolvable) {
    cdkBuilder.hostPath(hostPath)
  }

  /**
   * @param hostPath Specifies the configuration of a Kubernetes `hostPath` volume.
   * For more information, see
   * [hostPath](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/storage/volumes/#hostpath)
   * in the *Kubernetes documentation* .
   */
  public fun hostPath(hostPath: CfnJobDefinition.HostPathProperty) {
    cdkBuilder.hostPath(hostPath)
  }

  /**
   * @param name The name of the volume. 
   * The name must be allowed as a DNS subdomain name. For more information, see [DNS subdomain
   * names](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#dns-subdomain-names)
   * in the *Kubernetes documentation* .
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param secret Specifies the configuration of a Kubernetes `secret` volume.
   * For more information, see
   * [secret](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/storage/volumes/#secret)
   * in the *Kubernetes documentation* .
   */
  public fun secret(secret: IResolvable) {
    cdkBuilder.secret(secret)
  }

  /**
   * @param secret Specifies the configuration of a Kubernetes `secret` volume.
   * For more information, see
   * [secret](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/storage/volumes/#secret)
   * in the *Kubernetes documentation* .
   */
  public fun secret(secret: CfnJobDefinition.EksSecretProperty) {
    cdkBuilder.secret(secret)
  }

  public fun build(): CfnJobDefinition.EksVolumeProperty = cdkBuilder.build()
}
