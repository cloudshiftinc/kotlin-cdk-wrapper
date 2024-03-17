@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * The authorization configuration details for the Amazon EFS file system.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ecs.*;
 * AuthorizationConfig authorizationConfig = AuthorizationConfig.builder()
 * .accessPointId("accessPointId")
 * .iam("iam")
 * .build();
 * ```
 */
public interface AuthorizationConfig {
  /**
   * The access point ID to use.
   *
   * If an access point is specified, the root directory value will be
   * relative to the directory set for the access point.
   * If specified, transit encryption must be enabled in the EFSVolumeConfiguration.
   *
   * Default: No id
   */
  public fun accessPointId(): String? = unwrap(this).getAccessPointId()

  /**
   * Whether or not to use the Amazon ECS task IAM role defined in a task definition when mounting
   * the Amazon EFS file system.
   *
   * If enabled, transit encryption must be enabled in the EFSVolumeConfiguration.
   *
   * Valid values: ENABLED | DISABLED
   *
   * Default: If this parameter is omitted, the default value of DISABLED is used.
   */
  public fun iam(): String? = unwrap(this).getIam()

  /**
   * A builder for [AuthorizationConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accessPointId The access point ID to use.
     * If an access point is specified, the root directory value will be
     * relative to the directory set for the access point.
     * If specified, transit encryption must be enabled in the EFSVolumeConfiguration.
     */
    public fun accessPointId(accessPointId: String)

    /**
     * @param iam Whether or not to use the Amazon ECS task IAM role defined in a task definition
     * when mounting the Amazon EFS file system.
     * If enabled, transit encryption must be enabled in the EFSVolumeConfiguration.
     *
     * Valid values: ENABLED | DISABLED
     */
    public fun iam(iam: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.AuthorizationConfig.Builder =
        software.amazon.awscdk.services.ecs.AuthorizationConfig.builder()

    /**
     * @param accessPointId The access point ID to use.
     * If an access point is specified, the root directory value will be
     * relative to the directory set for the access point.
     * If specified, transit encryption must be enabled in the EFSVolumeConfiguration.
     */
    override fun accessPointId(accessPointId: String) {
      cdkBuilder.accessPointId(accessPointId)
    }

    /**
     * @param iam Whether or not to use the Amazon ECS task IAM role defined in a task definition
     * when mounting the Amazon EFS file system.
     * If enabled, transit encryption must be enabled in the EFSVolumeConfiguration.
     *
     * Valid values: ENABLED | DISABLED
     */
    override fun iam(iam: String) {
      cdkBuilder.iam(iam)
    }

    public fun build(): software.amazon.awscdk.services.ecs.AuthorizationConfig = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.AuthorizationConfig,
  ) : CdkObject(cdkObject), AuthorizationConfig {
    /**
     * The access point ID to use.
     *
     * If an access point is specified, the root directory value will be
     * relative to the directory set for the access point.
     * If specified, transit encryption must be enabled in the EFSVolumeConfiguration.
     *
     * Default: No id
     */
    override fun accessPointId(): String? = unwrap(this).getAccessPointId()

    /**
     * Whether or not to use the Amazon ECS task IAM role defined in a task definition when mounting
     * the Amazon EFS file system.
     *
     * If enabled, transit encryption must be enabled in the EFSVolumeConfiguration.
     *
     * Valid values: ENABLED | DISABLED
     *
     * Default: If this parameter is omitted, the default value of DISABLED is used.
     */
    override fun iam(): String? = unwrap(this).getIam()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AuthorizationConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.AuthorizationConfig):
        AuthorizationConfig = CdkObjectWrappers.wrap(cdkObject) as? AuthorizationConfig ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AuthorizationConfig):
        software.amazon.awscdk.services.ecs.AuthorizationConfig = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ecs.AuthorizationConfig
  }
}
