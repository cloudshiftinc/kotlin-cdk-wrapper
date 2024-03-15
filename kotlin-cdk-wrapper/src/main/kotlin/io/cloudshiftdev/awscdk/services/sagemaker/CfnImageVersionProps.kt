@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnImageVersionProps {
  public fun alias(): String? = unwrap(this).getAlias()

  public fun aliases(): List<String> = unwrap(this).getAliases() ?: emptyList()

  public fun baseImage(): String

  public fun horovod(): Any? = unwrap(this).getHorovod()

  public fun imageName(): String

  public fun jobType(): String? = unwrap(this).getJobType()

  public fun mlFramework(): String? = unwrap(this).getMlFramework()

  public fun processor(): String? = unwrap(this).getProcessor()

  public fun programmingLang(): String? = unwrap(this).getProgrammingLang()

  public fun releaseNotes(): String? = unwrap(this).getReleaseNotes()

  public fun vendorGuidance(): String? = unwrap(this).getVendorGuidance()

  @CdkDslMarker
  public interface Builder {
    public fun alias(alias: String)

    public fun aliases(aliases: List<String>)

    public fun aliases(vararg aliases: String)

    public fun baseImage(baseImage: String)

    public fun horovod(horovod: Boolean)

    public fun horovod(horovod: IResolvable)

    public fun imageName(imageName: String)

    public fun jobType(jobType: String)

    public fun mlFramework(mlFramework: String)

    public fun processor(processor: String)

    public fun programmingLang(programmingLang: String)

    public fun releaseNotes(releaseNotes: String)

    public fun vendorGuidance(vendorGuidance: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnImageVersionProps.Builder =
        software.amazon.awscdk.services.sagemaker.CfnImageVersionProps.builder()

    override fun alias(alias: String) {
      cdkBuilder.alias(alias)
    }

    override fun aliases(aliases: List<String>) {
      cdkBuilder.aliases(aliases)
    }

    override fun aliases(vararg aliases: String): Unit = aliases(aliases.toList())

    override fun baseImage(baseImage: String) {
      cdkBuilder.baseImage(baseImage)
    }

    override fun horovod(horovod: Boolean) {
      cdkBuilder.horovod(horovod)
    }

    override fun horovod(horovod: IResolvable) {
      cdkBuilder.horovod(horovod.let(IResolvable::unwrap))
    }

    override fun imageName(imageName: String) {
      cdkBuilder.imageName(imageName)
    }

    override fun jobType(jobType: String) {
      cdkBuilder.jobType(jobType)
    }

    override fun mlFramework(mlFramework: String) {
      cdkBuilder.mlFramework(mlFramework)
    }

    override fun processor(processor: String) {
      cdkBuilder.processor(processor)
    }

    override fun programmingLang(programmingLang: String) {
      cdkBuilder.programmingLang(programmingLang)
    }

    override fun releaseNotes(releaseNotes: String) {
      cdkBuilder.releaseNotes(releaseNotes)
    }

    override fun vendorGuidance(vendorGuidance: String) {
      cdkBuilder.vendorGuidance(vendorGuidance)
    }

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnImageVersionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sagemaker.CfnImageVersionProps,
  ) : CdkObject(cdkObject), CfnImageVersionProps {
    override fun alias(): String? = unwrap(this).getAlias()

    override fun aliases(): List<String> = unwrap(this).getAliases() ?: emptyList()

    override fun baseImage(): String = unwrap(this).getBaseImage()

    override fun horovod(): Any? = unwrap(this).getHorovod()

    override fun imageName(): String = unwrap(this).getImageName()

    override fun jobType(): String? = unwrap(this).getJobType()

    override fun mlFramework(): String? = unwrap(this).getMlFramework()

    override fun processor(): String? = unwrap(this).getProcessor()

    override fun programmingLang(): String? = unwrap(this).getProgrammingLang()

    override fun releaseNotes(): String? = unwrap(this).getReleaseNotes()

    override fun vendorGuidance(): String? = unwrap(this).getVendorGuidance()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnImageVersionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnImageVersionProps):
        CfnImageVersionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnImageVersionProps):
        software.amazon.awscdk.services.sagemaker.CfnImageVersionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.sagemaker.CfnImageVersionProps
  }
}
