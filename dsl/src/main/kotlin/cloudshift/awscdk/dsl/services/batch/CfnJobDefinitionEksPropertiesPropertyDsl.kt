@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.batch

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.batch.CfnJobDefinition

/**
 * An object that contains the properties for the Kubernetes resources of a job.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.batch.*;
 * Object labels;
 * Object limits;
 * Object requests;
 * EksPropertiesProperty eksPropertiesProperty = EksPropertiesProperty.builder()
 * .podProperties(PodPropertiesProperty.builder()
 * .containers(List.of(EksContainerProperty.builder()
 * .image("image")
 * // the properties below are optional
 * .args(List.of("args"))
 * .command(List.of("command"))
 * .env(List.of(EksContainerEnvironmentVariableProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .value("value")
 * .build()))
 * .imagePullPolicy("imagePullPolicy")
 * .name("name")
 * .resources(ResourcesProperty.builder()
 * .limits(limits)
 * .requests(requests)
 * .build())
 * .securityContext(SecurityContextProperty.builder()
 * .privileged(false)
 * .readOnlyRootFilesystem(false)
 * .runAsGroup(123)
 * .runAsNonRoot(false)
 * .runAsUser(123)
 * .build())
 * .volumeMounts(List.of(EksContainerVolumeMountProperty.builder()
 * .mountPath("mountPath")
 * .name("name")
 * .readOnly(false)
 * .build()))
 * .build()))
 * .dnsPolicy("dnsPolicy")
 * .hostNetwork(false)
 * .metadata(MetadataProperty.builder()
 * .labels(labels)
 * .build())
 * .serviceAccountName("serviceAccountName")
 * .volumes(List.of(EksVolumeProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .emptyDir(EmptyDirProperty.builder()
 * .medium("medium")
 * .sizeLimit("sizeLimit")
 * .build())
 * .hostPath(HostPathProperty.builder()
 * .path("path")
 * .build())
 * .secret(EksSecretProperty.builder()
 * .secretName("secretName")
 * // the properties below are optional
 * .optional(false)
 * .build())
 * .build()))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-eksproperties.html)
 */
@CdkDslMarker
public class CfnJobDefinitionEksPropertiesPropertyDsl {
  private val cdkBuilder: CfnJobDefinition.EksPropertiesProperty.Builder =
      CfnJobDefinition.EksPropertiesProperty.builder()

  /**
   * @param podProperties The properties for the Kubernetes pod resources of a job.
   */
  public fun podProperties(podProperties: IResolvable) {
    cdkBuilder.podProperties(podProperties)
  }

  /**
   * @param podProperties The properties for the Kubernetes pod resources of a job.
   */
  public fun podProperties(podProperties: CfnJobDefinition.PodPropertiesProperty) {
    cdkBuilder.podProperties(podProperties)
  }

  public fun build(): CfnJobDefinition.EksPropertiesProperty = cdkBuilder.build()
}
