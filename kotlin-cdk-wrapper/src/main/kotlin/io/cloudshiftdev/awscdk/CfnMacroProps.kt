@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnMacroProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun functionName(): String

  public fun logGroupName(): String? = unwrap(this).getLogGroupName()

  public fun logRoleArn(): String? = unwrap(this).getLogRoleArn()

  public fun name(): String

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun functionName(functionName: String)

    public fun logGroupName(logGroupName: String)

    public fun logRoleArn(logRoleArn: String)

    public fun name(name: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnMacroProps.Builder =
        software.amazon.awscdk.CfnMacroProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun functionName(functionName: String) {
      cdkBuilder.functionName(functionName)
    }

    override fun logGroupName(logGroupName: String) {
      cdkBuilder.logGroupName(logGroupName)
    }

    override fun logRoleArn(logRoleArn: String) {
      cdkBuilder.logRoleArn(logRoleArn)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.CfnMacroProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.CfnMacroProps,
  ) : CdkObject(cdkObject), CfnMacroProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun functionName(): String = unwrap(this).getFunctionName()

    override fun logGroupName(): String? = unwrap(this).getLogGroupName()

    override fun logRoleArn(): String? = unwrap(this).getLogRoleArn()

    override fun name(): String = unwrap(this).getName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnMacroProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnMacroProps): CfnMacroProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnMacroProps): software.amazon.awscdk.CfnMacroProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.CfnMacroProps
  }
}
