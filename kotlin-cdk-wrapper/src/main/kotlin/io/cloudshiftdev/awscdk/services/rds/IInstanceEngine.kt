@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.secretsmanager.SecretRotationApplication
import io.cloudshiftdev.constructs.Construct
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface IInstanceEngine : IEngine {
  public fun bindToInstance(arg0: Construct, arg1: InstanceEngineBindOptions): InstanceEngineConfig

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("448f711cfcc63a10acaf117d67161b9831a322dfb27d011d1dcf9ff4e8ec125f")
  public fun bindToInstance(arg0: Construct, arg1: InstanceEngineBindOptions.Builder.() -> Unit):
      InstanceEngineConfig

  public fun multiUserRotationApplication(): SecretRotationApplication

  public fun singleUserRotationApplication(): SecretRotationApplication

  public fun supportsReadReplicaBackups(): Boolean? = unwrap(this).getSupportsReadReplicaBackups()

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rds.IInstanceEngine,
  ) : CdkObject(cdkObject), IInstanceEngine {
    override fun bindToInstance(arg0: Construct, arg1: InstanceEngineBindOptions):
        InstanceEngineConfig = unwrap(this).bindToInstance(arg0.let(Construct::unwrap),
        arg1.let(InstanceEngineBindOptions::unwrap)).let(InstanceEngineConfig::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("448f711cfcc63a10acaf117d67161b9831a322dfb27d011d1dcf9ff4e8ec125f")
    override fun bindToInstance(arg0: Construct,
        arg1: InstanceEngineBindOptions.Builder.() -> Unit): InstanceEngineConfig =
        bindToInstance(arg0, InstanceEngineBindOptions(arg1))

    override fun defaultUsername(): String? = unwrap(this).getDefaultUsername()

    override fun engineFamily(): String? = unwrap(this).getEngineFamily()

    override fun engineType(): String = unwrap(this).getEngineType()

    override fun engineVersion(): EngineVersion? =
        unwrap(this).getEngineVersion()?.let(EngineVersion::wrap)

    override fun multiUserRotationApplication(): SecretRotationApplication =
        unwrap(this).getMultiUserRotationApplication().let(SecretRotationApplication::wrap)

    override fun parameterGroupFamily(): String? = unwrap(this).getParameterGroupFamily()

    override fun singleUserRotationApplication(): SecretRotationApplication =
        unwrap(this).getSingleUserRotationApplication().let(SecretRotationApplication::wrap)

    override fun supportsReadReplicaBackups(): Boolean? =
        unwrap(this).getSupportsReadReplicaBackups()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.IInstanceEngine):
        IInstanceEngine = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IInstanceEngine):
        software.amazon.awscdk.services.rds.IInstanceEngine = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.rds.IInstanceEngine
  }
}
