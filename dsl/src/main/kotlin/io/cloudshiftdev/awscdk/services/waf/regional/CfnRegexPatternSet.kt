package io.cloudshiftdev.awscdk.services.waf.regional

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnRegexPatternSet internal constructor(
  private val cdkObject: software.amazon.awscdk.services.waf.regional.CfnRegexPatternSet,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun regexPatternStrings(): List<String> = unwrap(this).getRegexPatternStrings() ?:
      emptyList()

  public open fun regexPatternStrings(`value`: List<String>) {
    unwrap(this).setRegexPatternStrings(`value`)
  }

  public interface Builder {
    public fun name(name: String)

    public fun regexPatternStrings(regexPatternStrings: List<String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.waf.regional.CfnRegexPatternSet.Builder
        = software.amazon.awscdk.services.waf.regional.CfnRegexPatternSet.Builder.create(scope, id)

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun regexPatternStrings(regexPatternStrings: List<String>) {
      cdkBuilder.regexPatternStrings(regexPatternStrings)
    }

    public fun build(): software.amazon.awscdk.services.waf.regional.CfnRegexPatternSet =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRegexPatternSet {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRegexPatternSet(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.waf.regional.CfnRegexPatternSet):
        CfnRegexPatternSet = CfnRegexPatternSet(cdkObject)

    internal fun unwrap(wrapped: CfnRegexPatternSet):
        software.amazon.awscdk.services.waf.regional.CfnRegexPatternSet = wrapped.cdkObject
  }
}
