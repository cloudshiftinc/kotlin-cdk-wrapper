@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * All Properties for Health Checks for mesh endpoints.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appmesh.*;
 * HealthCheckConfig healthCheckConfig = HealthCheckConfig.builder()
 * .virtualGatewayHealthCheck(VirtualGatewayHealthCheckPolicyProperty.builder()
 * .healthyThreshold(123)
 * .intervalMillis(123)
 * .protocol("protocol")
 * .timeoutMillis(123)
 * .unhealthyThreshold(123)
 * // the properties below are optional
 * .path("path")
 * .port(123)
 * .build())
 * .virtualNodeHealthCheck(HealthCheckProperty.builder()
 * .healthyThreshold(123)
 * .intervalMillis(123)
 * .protocol("protocol")
 * .timeoutMillis(123)
 * .unhealthyThreshold(123)
 * // the properties below are optional
 * .path("path")
 * .port(123)
 * .build())
 * .build();
 * ```
 */
public interface HealthCheckConfig {
  /**
   * VirtualGateway CFN configuration for Health Checks.
   *
   * Default: - no health checks
   */
  public fun virtualGatewayHealthCheck(): CfnVirtualGateway.VirtualGatewayHealthCheckPolicyProperty?
      =
      unwrap(this).getVirtualGatewayHealthCheck()?.let(CfnVirtualGateway.VirtualGatewayHealthCheckPolicyProperty::wrap)

  /**
   * VirtualNode CFN configuration for Health Checks.
   *
   * Default: - no health checks
   */
  public fun virtualNodeHealthCheck(): CfnVirtualNode.HealthCheckProperty? =
      unwrap(this).getVirtualNodeHealthCheck()?.let(CfnVirtualNode.HealthCheckProperty::wrap)

  /**
   * A builder for [HealthCheckConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param virtualGatewayHealthCheck VirtualGateway CFN configuration for Health Checks.
     */
    public
        fun virtualGatewayHealthCheck(virtualGatewayHealthCheck: CfnVirtualGateway.VirtualGatewayHealthCheckPolicyProperty)

    /**
     * @param virtualGatewayHealthCheck VirtualGateway CFN configuration for Health Checks.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5d2727c4abc0be2ab3184c7ee43a68ed3225d92e3f65f508da11122da666ab26")
    public
        fun virtualGatewayHealthCheck(virtualGatewayHealthCheck: CfnVirtualGateway.VirtualGatewayHealthCheckPolicyProperty.Builder.() -> Unit)

    /**
     * @param virtualNodeHealthCheck VirtualNode CFN configuration for Health Checks.
     */
    public fun virtualNodeHealthCheck(virtualNodeHealthCheck: CfnVirtualNode.HealthCheckProperty)

    /**
     * @param virtualNodeHealthCheck VirtualNode CFN configuration for Health Checks.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7075c05c4b9b75632e54ea94d7244864fd3d2863b4f2a408cac19135fed1d971")
    public
        fun virtualNodeHealthCheck(virtualNodeHealthCheck: CfnVirtualNode.HealthCheckProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.HealthCheckConfig.Builder =
        software.amazon.awscdk.services.appmesh.HealthCheckConfig.builder()

    /**
     * @param virtualGatewayHealthCheck VirtualGateway CFN configuration for Health Checks.
     */
    override
        fun virtualGatewayHealthCheck(virtualGatewayHealthCheck: CfnVirtualGateway.VirtualGatewayHealthCheckPolicyProperty) {
      cdkBuilder.virtualGatewayHealthCheck(virtualGatewayHealthCheck.let(CfnVirtualGateway.VirtualGatewayHealthCheckPolicyProperty.Companion::unwrap))
    }

    /**
     * @param virtualGatewayHealthCheck VirtualGateway CFN configuration for Health Checks.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5d2727c4abc0be2ab3184c7ee43a68ed3225d92e3f65f508da11122da666ab26")
    override
        fun virtualGatewayHealthCheck(virtualGatewayHealthCheck: CfnVirtualGateway.VirtualGatewayHealthCheckPolicyProperty.Builder.() -> Unit):
        Unit =
        virtualGatewayHealthCheck(CfnVirtualGateway.VirtualGatewayHealthCheckPolicyProperty(virtualGatewayHealthCheck))

    /**
     * @param virtualNodeHealthCheck VirtualNode CFN configuration for Health Checks.
     */
    override
        fun virtualNodeHealthCheck(virtualNodeHealthCheck: CfnVirtualNode.HealthCheckProperty) {
      cdkBuilder.virtualNodeHealthCheck(virtualNodeHealthCheck.let(CfnVirtualNode.HealthCheckProperty.Companion::unwrap))
    }

    /**
     * @param virtualNodeHealthCheck VirtualNode CFN configuration for Health Checks.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7075c05c4b9b75632e54ea94d7244864fd3d2863b4f2a408cac19135fed1d971")
    override
        fun virtualNodeHealthCheck(virtualNodeHealthCheck: CfnVirtualNode.HealthCheckProperty.Builder.() -> Unit):
        Unit = virtualNodeHealthCheck(CfnVirtualNode.HealthCheckProperty(virtualNodeHealthCheck))

    public fun build(): software.amazon.awscdk.services.appmesh.HealthCheckConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appmesh.HealthCheckConfig,
  ) : CdkObject(cdkObject),
      HealthCheckConfig {
    /**
     * VirtualGateway CFN configuration for Health Checks.
     *
     * Default: - no health checks
     */
    override fun virtualGatewayHealthCheck():
        CfnVirtualGateway.VirtualGatewayHealthCheckPolicyProperty? =
        unwrap(this).getVirtualGatewayHealthCheck()?.let(CfnVirtualGateway.VirtualGatewayHealthCheckPolicyProperty::wrap)

    /**
     * VirtualNode CFN configuration for Health Checks.
     *
     * Default: - no health checks
     */
    override fun virtualNodeHealthCheck(): CfnVirtualNode.HealthCheckProperty? =
        unwrap(this).getVirtualNodeHealthCheck()?.let(CfnVirtualNode.HealthCheckProperty::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HealthCheckConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.HealthCheckConfig):
        HealthCheckConfig = CdkObjectWrappers.wrap(cdkObject) as? HealthCheckConfig ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: HealthCheckConfig):
        software.amazon.awscdk.services.appmesh.HealthCheckConfig = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.appmesh.HealthCheckConfig
  }
}
