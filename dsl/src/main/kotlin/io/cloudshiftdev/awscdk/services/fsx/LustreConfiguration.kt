package io.cloudshiftdev.awscdk.services.fsx

import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface LustreConfiguration {
  public fun autoImportPolicy(): LustreAutoImportPolicy? =
      unwrap(this).getAutoImportPolicy()?.let(LustreAutoImportPolicy::wrap)

  public fun dataCompressionType(): LustreDataCompressionType? =
      unwrap(this).getDataCompressionType()?.let(LustreDataCompressionType::wrap)

  public fun deploymentType(): LustreDeploymentType

  public fun exportPath(): String? = unwrap(this).getExportPath()

  public fun importPath(): String? = unwrap(this).getImportPath()

  public fun importedFileChunkSizeMiB(): Number? = unwrap(this).getImportedFileChunkSizeMiB()

  public fun perUnitStorageThroughput(): Number? = unwrap(this).getPerUnitStorageThroughput()

  public fun weeklyMaintenanceStartTime(): LustreMaintenanceTime? =
      unwrap(this).getWeeklyMaintenanceStartTime()?.let(LustreMaintenanceTime::wrap)

  public interface Builder {
    public fun autoImportPolicy(autoImportPolicy: LustreAutoImportPolicy) {
    }

    public fun dataCompressionType(dataCompressionType: LustreDataCompressionType) {
    }

    public fun deploymentType(deploymentType: LustreDeploymentType) {
    }

    public fun exportPath(exportPath: String) {
    }

    public fun importPath(importPath: String) {
    }

    public fun importedFileChunkSizeMiB(importedFileChunkSizeMiB: Number) {
    }

    public fun perUnitStorageThroughput(perUnitStorageThroughput: Number) {
    }

    public fun weeklyMaintenanceStartTime(weeklyMaintenanceStartTime: LustreMaintenanceTime) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e1343833c242fcc61da33ba57517a2aefb662f1b43aafc47411fe6741b730a2e")
    public
        fun weeklyMaintenanceStartTime(weeklyMaintenanceStartTime: LustreMaintenanceTime.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.fsx.LustreConfiguration.Builder =
        software.amazon.awscdk.services.fsx.LustreConfiguration.builder()

    public override fun autoImportPolicy(autoImportPolicy: LustreAutoImportPolicy) {
      cdkBuilder.autoImportPolicy(autoImportPolicy.let(LustreAutoImportPolicy::unwrap))
    }

    public override fun dataCompressionType(dataCompressionType: LustreDataCompressionType) {
      cdkBuilder.dataCompressionType(dataCompressionType.let(LustreDataCompressionType::unwrap))
    }

    public override fun deploymentType(deploymentType: LustreDeploymentType) {
      cdkBuilder.deploymentType(deploymentType.let(LustreDeploymentType::unwrap))
    }

    public override fun exportPath(exportPath: String) {
      cdkBuilder.exportPath(exportPath)
    }

    public override fun importPath(importPath: String) {
      cdkBuilder.importPath(importPath)
    }

    public override fun importedFileChunkSizeMiB(importedFileChunkSizeMiB: Number) {
      cdkBuilder.importedFileChunkSizeMiB(importedFileChunkSizeMiB)
    }

    public override fun perUnitStorageThroughput(perUnitStorageThroughput: Number) {
      cdkBuilder.perUnitStorageThroughput(perUnitStorageThroughput)
    }

    public override
        fun weeklyMaintenanceStartTime(weeklyMaintenanceStartTime: LustreMaintenanceTime) {
      cdkBuilder.weeklyMaintenanceStartTime(weeklyMaintenanceStartTime.let(LustreMaintenanceTime::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e1343833c242fcc61da33ba57517a2aefb662f1b43aafc47411fe6741b730a2e")
    public override
        fun weeklyMaintenanceStartTime(weeklyMaintenanceStartTime: LustreMaintenanceTime.Builder.() -> Unit):
        Unit = weeklyMaintenanceStartTime(LustreMaintenanceTime(weeklyMaintenanceStartTime))

    public fun build(): software.amazon.awscdk.services.fsx.LustreConfiguration = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.fsx.LustreConfiguration,
  ) : LustreConfiguration {
    public override fun autoImportPolicy(): LustreAutoImportPolicy? =
        unwrap(this).getAutoImportPolicy()?.let(LustreAutoImportPolicy::wrap)

    public override fun dataCompressionType(): LustreDataCompressionType? =
        unwrap(this).getDataCompressionType()?.let(LustreDataCompressionType::wrap)

    public override fun deploymentType(): LustreDeploymentType =
        unwrap(this).getDeploymentType().let(LustreDeploymentType::wrap)

    public override fun exportPath(): String? = unwrap(this).getExportPath()

    public override fun importPath(): String? = unwrap(this).getImportPath()

    public override fun importedFileChunkSizeMiB(): Number? =
        unwrap(this).getImportedFileChunkSizeMiB()

    public override fun perUnitStorageThroughput(): Number? =
        unwrap(this).getPerUnitStorageThroughput()

    public override fun weeklyMaintenanceStartTime(): LustreMaintenanceTime? =
        unwrap(this).getWeeklyMaintenanceStartTime()?.let(LustreMaintenanceTime::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): LustreConfiguration {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.fsx.LustreConfiguration):
        LustreConfiguration = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LustreConfiguration):
        software.amazon.awscdk.services.fsx.LustreConfiguration = (wrapped as Wrapper).cdkObject
  }
}
