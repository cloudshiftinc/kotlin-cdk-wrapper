@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.eks.LaunchTemplateSpec

/**
 * Launch template property specification.
 *
 * Example:
 *
 * ```
 * Cluster cluster;
 * String userData = "MIME-Version: 1.0\nContent-Type: multipart/mixed;
 * boundary=\"==MYBOUNDARY==\"\n\n--==MYBOUNDARY==\nContent-Type: text/x-shellscript;
 * charset=\"us-ascii\"\n\n#!/bin/bash\necho \"Running custom user data
 * script\"\n\n--==MYBOUNDARY==--\\\n";
 * CfnLaunchTemplate lt = CfnLaunchTemplate.Builder.create(this, "LaunchTemplate")
 * .launchTemplateData(LaunchTemplateDataProperty.builder()
 * .instanceType("t3.small")
 * .userData(Fn.base64(userData))
 * .build())
 * .build();
 * cluster.addNodegroupCapacity("extra-ng", NodegroupOptions.builder()
 * .launchTemplateSpec(LaunchTemplateSpec.builder()
 * .id(lt.getRef())
 * .version(lt.getAttrLatestVersionNumber())
 * .build())
 * .build());
 * ```
 */
@CdkDslMarker
public class LaunchTemplateSpecDsl {
  private val cdkBuilder: LaunchTemplateSpec.Builder = LaunchTemplateSpec.builder()

  /**
   * @param id The Launch template ID. 
   */
  public fun id(id: String) {
    cdkBuilder.id(id)
  }

  /**
   * @param version The launch template version to be used (optional).
   */
  public fun version(version: String) {
    cdkBuilder.version(version)
  }

  public fun build(): LaunchTemplateSpec = cdkBuilder.build()
}
