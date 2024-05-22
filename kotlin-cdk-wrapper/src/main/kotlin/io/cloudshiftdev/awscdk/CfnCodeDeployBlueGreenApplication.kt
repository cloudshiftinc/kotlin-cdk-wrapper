@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * The application actually being deployed.
 *
 * Type of the `CfnCodeDeployBlueGreenHookProps.applications` property.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * CfnCodeDeployBlueGreenApplication cfnCodeDeployBlueGreenApplication =
 * CfnCodeDeployBlueGreenApplication.builder()
 * .ecsAttributes(CfnCodeDeployBlueGreenEcsAttributes.builder()
 * .taskDefinitions(List.of("taskDefinitions"))
 * .taskSets(List.of("taskSets"))
 * .trafficRouting(CfnTrafficRouting.builder()
 * .prodTrafficRoute(CfnTrafficRoute.builder()
 * .logicalId("logicalId")
 * .type("type")
 * .build())
 * .targetGroups(List.of("targetGroups"))
 * .testTrafficRoute(CfnTrafficRoute.builder()
 * .logicalId("logicalId")
 * .type("type")
 * .build())
 * .build())
 * .build())
 * .target(CfnCodeDeployBlueGreenApplicationTarget.builder()
 * .logicalId("logicalId")
 * .type("type")
 * .build())
 * .build();
 * ```
 */
public interface CfnCodeDeployBlueGreenApplication {
  /**
   * The detailed attributes of the deployed target.
   */
  public fun ecsAttributes(): CfnCodeDeployBlueGreenEcsAttributes

  /**
   * The target that is being deployed.
   */
  public fun target(): CfnCodeDeployBlueGreenApplicationTarget

  /**
   * A builder for [CfnCodeDeployBlueGreenApplication]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param ecsAttributes The detailed attributes of the deployed target. 
     */
    public fun ecsAttributes(ecsAttributes: CfnCodeDeployBlueGreenEcsAttributes)

    /**
     * @param ecsAttributes The detailed attributes of the deployed target. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2949b093137affa82667f7aadd73d2a3f9a659a80e8ce0a5773e3a9520660c1a")
    public fun ecsAttributes(ecsAttributes: CfnCodeDeployBlueGreenEcsAttributes.Builder.() -> Unit)

    /**
     * @param target The target that is being deployed. 
     */
    public fun target(target: CfnCodeDeployBlueGreenApplicationTarget)

    /**
     * @param target The target that is being deployed. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7a6b144a7caab90d92ab5814297f2d3e984915d397737fb5bcc194546504c0df")
    public fun target(target: CfnCodeDeployBlueGreenApplicationTarget.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnCodeDeployBlueGreenApplication.Builder =
        software.amazon.awscdk.CfnCodeDeployBlueGreenApplication.builder()

    /**
     * @param ecsAttributes The detailed attributes of the deployed target. 
     */
    override fun ecsAttributes(ecsAttributes: CfnCodeDeployBlueGreenEcsAttributes) {
      cdkBuilder.ecsAttributes(ecsAttributes.let(CfnCodeDeployBlueGreenEcsAttributes.Companion::unwrap))
    }

    /**
     * @param ecsAttributes The detailed attributes of the deployed target. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2949b093137affa82667f7aadd73d2a3f9a659a80e8ce0a5773e3a9520660c1a")
    override
        fun ecsAttributes(ecsAttributes: CfnCodeDeployBlueGreenEcsAttributes.Builder.() -> Unit):
        Unit = ecsAttributes(CfnCodeDeployBlueGreenEcsAttributes(ecsAttributes))

    /**
     * @param target The target that is being deployed. 
     */
    override fun target(target: CfnCodeDeployBlueGreenApplicationTarget) {
      cdkBuilder.target(target.let(CfnCodeDeployBlueGreenApplicationTarget.Companion::unwrap))
    }

    /**
     * @param target The target that is being deployed. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7a6b144a7caab90d92ab5814297f2d3e984915d397737fb5bcc194546504c0df")
    override fun target(target: CfnCodeDeployBlueGreenApplicationTarget.Builder.() -> Unit): Unit =
        target(CfnCodeDeployBlueGreenApplicationTarget(target))

    public fun build(): software.amazon.awscdk.CfnCodeDeployBlueGreenApplication =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.CfnCodeDeployBlueGreenApplication,
  ) : CdkObject(cdkObject), CfnCodeDeployBlueGreenApplication {
    /**
     * The detailed attributes of the deployed target.
     */
    override fun ecsAttributes(): CfnCodeDeployBlueGreenEcsAttributes =
        unwrap(this).getEcsAttributes().let(CfnCodeDeployBlueGreenEcsAttributes::wrap)

    /**
     * The target that is being deployed.
     */
    override fun target(): CfnCodeDeployBlueGreenApplicationTarget =
        unwrap(this).getTarget().let(CfnCodeDeployBlueGreenApplicationTarget::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCodeDeployBlueGreenApplication {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnCodeDeployBlueGreenApplication):
        CfnCodeDeployBlueGreenApplication = CdkObjectWrappers.wrap(cdkObject) as?
        CfnCodeDeployBlueGreenApplication ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCodeDeployBlueGreenApplication):
        software.amazon.awscdk.CfnCodeDeployBlueGreenApplication = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.CfnCodeDeployBlueGreenApplication
  }
}
