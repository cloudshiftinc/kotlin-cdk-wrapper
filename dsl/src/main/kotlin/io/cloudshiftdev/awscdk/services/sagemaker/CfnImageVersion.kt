package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnImageVersion internal constructor(
  private val cdkObject: software.amazon.awscdk.services.sagemaker.CfnImageVersion,
) : CfnResource(cdkObject), IInspectable {
  public open fun alias(): String? = unwrap(this).getAlias()

  public open fun alias(`value`: String) {
    unwrap(this).setAlias(`value`)
  }

  public open fun aliases(): List<String> = unwrap(this).getAliases() ?: emptyList()

  public open fun aliases(`value`: List<String>) {
    unwrap(this).setAliases(`value`)
  }

  public open fun aliases(vararg `value`: String): Unit = aliases(`value`.toList())

  public open fun attrContainerImage(): String = unwrap(this).getAttrContainerImage()

  public open fun attrImageArn(): String = unwrap(this).getAttrImageArn()

  public open fun attrImageVersionArn(): String = unwrap(this).getAttrImageVersionArn()

  public open fun attrVersion(): Number = unwrap(this).getAttrVersion()

  public open fun baseImage(): String = unwrap(this).getBaseImage()

  public open fun baseImage(`value`: String) {
    unwrap(this).setBaseImage(`value`)
  }

  public open fun horovod(): Any? = unwrap(this).getHorovod()

  public open fun horovod(`value`: Boolean) {
    unwrap(this).setHorovod(`value`)
  }

  public open fun horovod(`value`: IResolvable) {
    unwrap(this).setHorovod(`value`.let(IResolvable::unwrap))
  }

  public open fun imageName(): String = unwrap(this).getImageName()

  public open fun imageName(`value`: String) {
    unwrap(this).setImageName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun jobType(): String? = unwrap(this).getJobType()

  public open fun jobType(`value`: String) {
    unwrap(this).setJobType(`value`)
  }

  public open fun mlFramework(): String? = unwrap(this).getMlFramework()

  public open fun mlFramework(`value`: String) {
    unwrap(this).setMlFramework(`value`)
  }

  public open fun processor(): String? = unwrap(this).getProcessor()

  public open fun processor(`value`: String) {
    unwrap(this).setProcessor(`value`)
  }

  public open fun programmingLang(): String? = unwrap(this).getProgrammingLang()

  public open fun programmingLang(`value`: String) {
    unwrap(this).setProgrammingLang(`value`)
  }

  public open fun releaseNotes(): String? = unwrap(this).getReleaseNotes()

  public open fun releaseNotes(`value`: String) {
    unwrap(this).setReleaseNotes(`value`)
  }

  public open fun vendorGuidance(): String? = unwrap(this).getVendorGuidance()

  public open fun vendorGuidance(`value`: String) {
    unwrap(this).setVendorGuidance(`value`)
  }

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

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnImageVersion.Builder =
        software.amazon.awscdk.services.sagemaker.CfnImageVersion.Builder.create(scope, id)

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

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnImageVersion =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnImageVersion {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnImageVersion(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnImageVersion):
        CfnImageVersion = CfnImageVersion(cdkObject)

    internal fun unwrap(wrapped: CfnImageVersion):
        software.amazon.awscdk.services.sagemaker.CfnImageVersion = wrapped.cdkObject
  }
}
