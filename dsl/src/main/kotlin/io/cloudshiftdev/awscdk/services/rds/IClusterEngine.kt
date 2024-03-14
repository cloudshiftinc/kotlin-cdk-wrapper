package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.services.secretsmanager.SecretRotationApplication
import io.cloudshiftdev.constructs.Construct
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface IClusterEngine : IEngine {
  public fun bindToCluster(arg0: Construct, arg1: ClusterEngineBindOptions): ClusterEngineConfig

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9db4165b6dd46987c5db0e71079e9d6a87f0e537509ad2fc4a4ffa36d17032ec")
  public fun bindToCluster(arg0: Construct, arg1: ClusterEngineBindOptions.Builder.() -> Unit):
      ClusterEngineConfig

  public fun combineImportAndExportRoles(): Boolean? = unwrap(this).getCombineImportAndExportRoles()

  public fun multiUserRotationApplication(): SecretRotationApplication

  public fun singleUserRotationApplication(): SecretRotationApplication

  public fun supportedLogTypes(): List<String>

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.rds.IClusterEngine,
  ) : IClusterEngine {
    override fun bindToCluster(arg0: Construct, arg1: ClusterEngineBindOptions): ClusterEngineConfig
        = unwrap(this).bindToCluster(arg0.let(Construct::unwrap),
        arg1.let(ClusterEngineBindOptions::unwrap)).let(ClusterEngineConfig::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9db4165b6dd46987c5db0e71079e9d6a87f0e537509ad2fc4a4ffa36d17032ec")
    override fun bindToCluster(arg0: Construct, arg1: ClusterEngineBindOptions.Builder.() -> Unit):
        ClusterEngineConfig = bindToCluster(arg0, ClusterEngineBindOptions(arg1))

    override fun combineImportAndExportRoles(): Boolean? =
        unwrap(this).getCombineImportAndExportRoles()

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

    override fun supportedLogTypes(): List<String> = unwrap(this).getSupportedLogTypes() ?:
        emptyList()
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.IClusterEngine): IClusterEngine
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IClusterEngine): software.amazon.awscdk.services.rds.IClusterEngine
        = (wrapped as Wrapper).cdkObject
  }
}
