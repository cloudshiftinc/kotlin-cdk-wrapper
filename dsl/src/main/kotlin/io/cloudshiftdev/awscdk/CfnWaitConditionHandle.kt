package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnWaitConditionHandle internal constructor(
  private val cdkObject: software.amazon.awscdk.CfnWaitConditionHandle,
) : CfnResource(cdkObject), IInspectable {
  /**
   * A unique identifier for the resource.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.CfnWaitConditionHandle].
   */
  @CdkDslMarker
  public interface Builder

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnWaitConditionHandle.Builder =
        software.amazon.awscdk.CfnWaitConditionHandle.Builder.create(scope, id)

    public fun build(): software.amazon.awscdk.CfnWaitConditionHandle = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnWaitConditionHandle {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnWaitConditionHandle(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnWaitConditionHandle):
        CfnWaitConditionHandle = CfnWaitConditionHandle(cdkObject)

    internal fun unwrap(wrapped: CfnWaitConditionHandle):
        software.amazon.awscdk.CfnWaitConditionHandle = wrapped.cdkObject
  }
}
