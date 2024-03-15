@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnRecordSetGroupProps {
  public fun comment(): String? = unwrap(this).getComment()

  public fun hostedZoneId(): String? = unwrap(this).getHostedZoneId()

  public fun hostedZoneName(): String? = unwrap(this).getHostedZoneName()

  public fun recordSets(): Any? = unwrap(this).getRecordSets()

  @CdkDslMarker
  public interface Builder {
    public fun comment(comment: String)

    public fun hostedZoneId(hostedZoneId: String)

    public fun hostedZoneName(hostedZoneName: String)

    public fun recordSets(recordSets: IResolvable)

    public fun recordSets(recordSets: List<Any>)

    public fun recordSets(vararg recordSets: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.route53.CfnRecordSetGroupProps.Builder =
        software.amazon.awscdk.services.route53.CfnRecordSetGroupProps.builder()

    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    override fun hostedZoneId(hostedZoneId: String) {
      cdkBuilder.hostedZoneId(hostedZoneId)
    }

    override fun hostedZoneName(hostedZoneName: String) {
      cdkBuilder.hostedZoneName(hostedZoneName)
    }

    override fun recordSets(recordSets: IResolvable) {
      cdkBuilder.recordSets(recordSets.let(IResolvable::unwrap))
    }

    override fun recordSets(recordSets: List<Any>) {
      cdkBuilder.recordSets(recordSets)
    }

    override fun recordSets(vararg recordSets: Any): Unit = recordSets(recordSets.toList())

    public fun build(): software.amazon.awscdk.services.route53.CfnRecordSetGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.route53.CfnRecordSetGroupProps,
  ) : CdkObject(cdkObject), CfnRecordSetGroupProps {
    override fun comment(): String? = unwrap(this).getComment()

    override fun hostedZoneId(): String? = unwrap(this).getHostedZoneId()

    override fun hostedZoneName(): String? = unwrap(this).getHostedZoneName()

    override fun recordSets(): Any? = unwrap(this).getRecordSets()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRecordSetGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.CfnRecordSetGroupProps):
        CfnRecordSetGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRecordSetGroupProps):
        software.amazon.awscdk.services.route53.CfnRecordSetGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.route53.CfnRecordSetGroupProps
  }
}
