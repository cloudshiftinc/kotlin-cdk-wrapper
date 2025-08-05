@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Properties for creating an Amazon EKS Add-On.
 *
 * Example:
 *
 * ```
 * Cluster cluster;
 * Addon.Builder.create(this, "Addon")
 * .cluster(cluster)
 * .addonName("coredns")
 * .addonVersion("v1.11.4-eksbuild.2")
 * // whether to preserve the add-on software on your cluster but Amazon EKS stops managing any
 * settings for the add-on.
 * .preserveOnDelete(false)
 * .configurationValues(Map.of(
 * "replicaCount", 2))
 * .build();
 * ```
 */
public interface AddonProps {
  /**
   * Name of the Add-On.
   */
  public fun addonName(): String

  /**
   * Version of the Add-On.
   *
   * You can check all available versions with describe-addon-versions.
   * For example, this lists all available versions for the `eks-pod-identity-agent` addon:
   * $ aws eks describe-addon-versions --addon-name eks-pod-identity-agent \
   * --query 'addons[*].addonVersions[*].addonVersion'
   *
   * Default: the latest version.
   */
  public fun addonVersion(): String? = unwrap(this).getAddonVersion()

  /**
   * The EKS cluster the Add-On is associated with.
   */
  public fun cluster(): ICluster

  /**
   * The configuration values for the Add-on.
   *
   * Default: - Use default configuration.
   */
  public fun configurationValues(): Map<String, Any> = unwrap(this).getConfigurationValues() ?:
      emptyMap()

  /**
   * Specifying this option preserves the add-on software on your cluster but Amazon EKS stops
   * managing any settings for the add-on.
   *
   * If an IAM account is associated with the add-on, it isn't removed.
   *
   * Default: true
   */
  public fun preserveOnDelete(): Boolean? = unwrap(this).getPreserveOnDelete()

  /**
   * A builder for [AddonProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param addonName Name of the Add-On. 
     */
    public fun addonName(addonName: String)

    /**
     * @param addonVersion Version of the Add-On.
     * You can check all available versions with describe-addon-versions.
     * For example, this lists all available versions for the `eks-pod-identity-agent` addon:
     * $ aws eks describe-addon-versions --addon-name eks-pod-identity-agent \
     * --query 'addons[*].addonVersions[*].addonVersion'
     */
    public fun addonVersion(addonVersion: String)

    /**
     * @param cluster The EKS cluster the Add-On is associated with. 
     */
    public fun cluster(cluster: ICluster)

    /**
     * @param configurationValues The configuration values for the Add-on.
     */
    public fun configurationValues(configurationValues: Map<String, Any>)

    /**
     * @param preserveOnDelete Specifying this option preserves the add-on software on your cluster
     * but Amazon EKS stops managing any settings for the add-on.
     * If an IAM account is associated with the add-on, it isn't removed.
     */
    public fun preserveOnDelete(preserveOnDelete: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.AddonProps.Builder =
        software.amazon.awscdk.services.eks.AddonProps.builder()

    /**
     * @param addonName Name of the Add-On. 
     */
    override fun addonName(addonName: String) {
      cdkBuilder.addonName(addonName)
    }

    /**
     * @param addonVersion Version of the Add-On.
     * You can check all available versions with describe-addon-versions.
     * For example, this lists all available versions for the `eks-pod-identity-agent` addon:
     * $ aws eks describe-addon-versions --addon-name eks-pod-identity-agent \
     * --query 'addons[*].addonVersions[*].addonVersion'
     */
    override fun addonVersion(addonVersion: String) {
      cdkBuilder.addonVersion(addonVersion)
    }

    /**
     * @param cluster The EKS cluster the Add-On is associated with. 
     */
    override fun cluster(cluster: ICluster) {
      cdkBuilder.cluster(cluster.let(ICluster.Companion::unwrap))
    }

    /**
     * @param configurationValues The configuration values for the Add-on.
     */
    override fun configurationValues(configurationValues: Map<String, Any>) {
      cdkBuilder.configurationValues(configurationValues.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * @param preserveOnDelete Specifying this option preserves the add-on software on your cluster
     * but Amazon EKS stops managing any settings for the add-on.
     * If an IAM account is associated with the add-on, it isn't removed.
     */
    override fun preserveOnDelete(preserveOnDelete: Boolean) {
      cdkBuilder.preserveOnDelete(preserveOnDelete)
    }

    public fun build(): software.amazon.awscdk.services.eks.AddonProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.eks.AddonProps,
  ) : CdkObject(cdkObject),
      AddonProps {
    /**
     * Name of the Add-On.
     */
    override fun addonName(): String = unwrap(this).getAddonName()

    /**
     * Version of the Add-On.
     *
     * You can check all available versions with describe-addon-versions.
     * For example, this lists all available versions for the `eks-pod-identity-agent` addon:
     * $ aws eks describe-addon-versions --addon-name eks-pod-identity-agent \
     * --query 'addons[*].addonVersions[*].addonVersion'
     *
     * Default: the latest version.
     */
    override fun addonVersion(): String? = unwrap(this).getAddonVersion()

    /**
     * The EKS cluster the Add-On is associated with.
     */
    override fun cluster(): ICluster = unwrap(this).getCluster().let(ICluster::wrap)

    /**
     * The configuration values for the Add-on.
     *
     * Default: - Use default configuration.
     */
    override fun configurationValues(): Map<String, Any> = unwrap(this).getConfigurationValues() ?:
        emptyMap()

    /**
     * Specifying this option preserves the add-on software on your cluster but Amazon EKS stops
     * managing any settings for the add-on.
     *
     * If an IAM account is associated with the add-on, it isn't removed.
     *
     * Default: true
     */
    override fun preserveOnDelete(): Boolean? = unwrap(this).getPreserveOnDelete()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AddonProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.AddonProps): AddonProps =
        CdkObjectWrappers.wrap(cdkObject) as? AddonProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: AddonProps): software.amazon.awscdk.services.eks.AddonProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.eks.AddonProps
  }
}
