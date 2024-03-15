@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnJobTemplateProps {
  public fun abortConfig(): Any? = unwrap(this).getAbortConfig()

  public fun description(): String

  public fun destinationPackageVersions(): List<String> =
      unwrap(this).getDestinationPackageVersions() ?: emptyList()

  public fun document(): String? = unwrap(this).getDocument()

  public fun documentSource(): String? = unwrap(this).getDocumentSource()

  public fun jobArn(): String? = unwrap(this).getJobArn()

  public fun jobExecutionsRetryConfig(): Any? = unwrap(this).getJobExecutionsRetryConfig()

  public fun jobExecutionsRolloutConfig(): Any? = unwrap(this).getJobExecutionsRolloutConfig()

  public fun jobTemplateId(): String

  public fun maintenanceWindows(): Any? = unwrap(this).getMaintenanceWindows()

  public fun presignedUrlConfig(): Any? = unwrap(this).getPresignedUrlConfig()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun timeoutConfig(): Any? = unwrap(this).getTimeoutConfig()

  @CdkDslMarker
  public interface Builder {
    public fun abortConfig(abortConfig: Any)

    public fun description(description: String)

    public fun destinationPackageVersions(destinationPackageVersions: List<String>)

    public fun destinationPackageVersions(vararg destinationPackageVersions: String)

    public fun document(document: String)

    public fun documentSource(documentSource: String)

    public fun jobArn(jobArn: String)

    public fun jobExecutionsRetryConfig(jobExecutionsRetryConfig: IResolvable)

    public
        fun jobExecutionsRetryConfig(jobExecutionsRetryConfig: CfnJobTemplate.JobExecutionsRetryConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("67d9816317c8b001f7f1d1bb48362a76195f2d13cc3a5ab6fc68e9b1ff5bff3d")
    public
        fun jobExecutionsRetryConfig(jobExecutionsRetryConfig: CfnJobTemplate.JobExecutionsRetryConfigProperty.Builder.() -> Unit)

    public fun jobExecutionsRolloutConfig(jobExecutionsRolloutConfig: Any)

    public fun jobTemplateId(jobTemplateId: String)

    public fun maintenanceWindows(maintenanceWindows: IResolvable)

    public fun maintenanceWindows(maintenanceWindows: List<Any>)

    public fun maintenanceWindows(vararg maintenanceWindows: Any)

    public fun presignedUrlConfig(presignedUrlConfig: Any)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun timeoutConfig(timeoutConfig: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnJobTemplateProps.Builder =
        software.amazon.awscdk.services.iot.CfnJobTemplateProps.builder()

    override fun abortConfig(abortConfig: Any) {
      cdkBuilder.abortConfig(abortConfig)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun destinationPackageVersions(destinationPackageVersions: List<String>) {
      cdkBuilder.destinationPackageVersions(destinationPackageVersions)
    }

    override fun destinationPackageVersions(vararg destinationPackageVersions: String): Unit =
        destinationPackageVersions(destinationPackageVersions.toList())

    override fun document(document: String) {
      cdkBuilder.document(document)
    }

    override fun documentSource(documentSource: String) {
      cdkBuilder.documentSource(documentSource)
    }

    override fun jobArn(jobArn: String) {
      cdkBuilder.jobArn(jobArn)
    }

    override fun jobExecutionsRetryConfig(jobExecutionsRetryConfig: IResolvable) {
      cdkBuilder.jobExecutionsRetryConfig(jobExecutionsRetryConfig.let(IResolvable::unwrap))
    }

    override
        fun jobExecutionsRetryConfig(jobExecutionsRetryConfig: CfnJobTemplate.JobExecutionsRetryConfigProperty) {
      cdkBuilder.jobExecutionsRetryConfig(jobExecutionsRetryConfig.let(CfnJobTemplate.JobExecutionsRetryConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("67d9816317c8b001f7f1d1bb48362a76195f2d13cc3a5ab6fc68e9b1ff5bff3d")
    override
        fun jobExecutionsRetryConfig(jobExecutionsRetryConfig: CfnJobTemplate.JobExecutionsRetryConfigProperty.Builder.() -> Unit):
        Unit =
        jobExecutionsRetryConfig(CfnJobTemplate.JobExecutionsRetryConfigProperty(jobExecutionsRetryConfig))

    override fun jobExecutionsRolloutConfig(jobExecutionsRolloutConfig: Any) {
      cdkBuilder.jobExecutionsRolloutConfig(jobExecutionsRolloutConfig)
    }

    override fun jobTemplateId(jobTemplateId: String) {
      cdkBuilder.jobTemplateId(jobTemplateId)
    }

    override fun maintenanceWindows(maintenanceWindows: IResolvable) {
      cdkBuilder.maintenanceWindows(maintenanceWindows.let(IResolvable::unwrap))
    }

    override fun maintenanceWindows(maintenanceWindows: List<Any>) {
      cdkBuilder.maintenanceWindows(maintenanceWindows)
    }

    override fun maintenanceWindows(vararg maintenanceWindows: Any): Unit =
        maintenanceWindows(maintenanceWindows.toList())

    override fun presignedUrlConfig(presignedUrlConfig: Any) {
      cdkBuilder.presignedUrlConfig(presignedUrlConfig)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun timeoutConfig(timeoutConfig: Any) {
      cdkBuilder.timeoutConfig(timeoutConfig)
    }

    public fun build(): software.amazon.awscdk.services.iot.CfnJobTemplateProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iot.CfnJobTemplateProps,
  ) : CdkObject(cdkObject), CfnJobTemplateProps {
    override fun abortConfig(): Any? = unwrap(this).getAbortConfig()

    override fun description(): String = unwrap(this).getDescription()

    override fun destinationPackageVersions(): List<String> =
        unwrap(this).getDestinationPackageVersions() ?: emptyList()

    override fun document(): String? = unwrap(this).getDocument()

    override fun documentSource(): String? = unwrap(this).getDocumentSource()

    override fun jobArn(): String? = unwrap(this).getJobArn()

    override fun jobExecutionsRetryConfig(): Any? = unwrap(this).getJobExecutionsRetryConfig()

    override fun jobExecutionsRolloutConfig(): Any? = unwrap(this).getJobExecutionsRolloutConfig()

    override fun jobTemplateId(): String = unwrap(this).getJobTemplateId()

    override fun maintenanceWindows(): Any? = unwrap(this).getMaintenanceWindows()

    override fun presignedUrlConfig(): Any? = unwrap(this).getPresignedUrlConfig()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun timeoutConfig(): Any? = unwrap(this).getTimeoutConfig()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnJobTemplateProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnJobTemplateProps):
        CfnJobTemplateProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnJobTemplateProps):
        software.amazon.awscdk.services.iot.CfnJobTemplateProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.iot.CfnJobTemplateProps
  }
}
