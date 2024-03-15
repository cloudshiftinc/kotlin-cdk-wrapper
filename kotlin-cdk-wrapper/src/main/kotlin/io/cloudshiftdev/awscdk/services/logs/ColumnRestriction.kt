@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface ColumnRestriction {
  public fun comparison(): String

  public fun numberValue(): Number? = unwrap(this).getNumberValue()

  public fun stringValue(): String? = unwrap(this).getStringValue()

  @CdkDslMarker
  public interface Builder {
    public fun comparison(comparison: String)

    public fun numberValue(numberValue: Number)

    public fun stringValue(stringValue: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.ColumnRestriction.Builder =
        software.amazon.awscdk.services.logs.ColumnRestriction.builder()

    override fun comparison(comparison: String) {
      cdkBuilder.comparison(comparison)
    }

    override fun numberValue(numberValue: Number) {
      cdkBuilder.numberValue(numberValue)
    }

    override fun stringValue(stringValue: String) {
      cdkBuilder.stringValue(stringValue)
    }

    public fun build(): software.amazon.awscdk.services.logs.ColumnRestriction = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.logs.ColumnRestriction,
  ) : CdkObject(cdkObject), ColumnRestriction {
    override fun comparison(): String = unwrap(this).getComparison()

    override fun numberValue(): Number? = unwrap(this).getNumberValue()

    override fun stringValue(): String? = unwrap(this).getStringValue()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ColumnRestriction {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.ColumnRestriction):
        ColumnRestriction = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ColumnRestriction):
        software.amazon.awscdk.services.logs.ColumnRestriction = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.logs.ColumnRestriction
  }
}
