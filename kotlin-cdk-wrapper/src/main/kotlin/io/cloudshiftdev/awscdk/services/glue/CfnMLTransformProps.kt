@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.glue

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnMLTransformProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun glueVersion(): String? = unwrap(this).getGlueVersion()

  public fun inputRecordTables(): Any

  public fun maxCapacity(): Number? = unwrap(this).getMaxCapacity()

  public fun maxRetries(): Number? = unwrap(this).getMaxRetries()

  public fun name(): String? = unwrap(this).getName()

  public fun numberOfWorkers(): Number? = unwrap(this).getNumberOfWorkers()

  public fun role(): String

  public fun tags(): Any? = unwrap(this).getTags()

  public fun timeout(): Number? = unwrap(this).getTimeout()

  public fun transformEncryption(): Any? = unwrap(this).getTransformEncryption()

  public fun transformParameters(): Any

  public fun workerType(): String? = unwrap(this).getWorkerType()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun glueVersion(glueVersion: String)

    public fun inputRecordTables(inputRecordTables: IResolvable)

    public fun inputRecordTables(inputRecordTables: CfnMLTransform.InputRecordTablesProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e8da151c4040cc639bd7c33e205b6ffe6a64840570c2d41166ca9462040c1fc0")
    public
        fun inputRecordTables(inputRecordTables: CfnMLTransform.InputRecordTablesProperty.Builder.() -> Unit)

    public fun maxCapacity(maxCapacity: Number)

    public fun maxRetries(maxRetries: Number)

    public fun name(name: String)

    public fun numberOfWorkers(numberOfWorkers: Number)

    public fun role(role: String)

    public fun tags(tags: Any)

    public fun timeout(timeout: Number)

    public fun transformEncryption(transformEncryption: IResolvable)

    public fun transformEncryption(transformEncryption: CfnMLTransform.TransformEncryptionProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e5cb02a0469e41da2782260cbf1bac3a2f4f537b8dcb9b50de4cb9c520a51a1c")
    public
        fun transformEncryption(transformEncryption: CfnMLTransform.TransformEncryptionProperty.Builder.() -> Unit)

    public fun transformParameters(transformParameters: IResolvable)

    public fun transformParameters(transformParameters: CfnMLTransform.TransformParametersProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ee80a6d6c67fc3517c42dc75b63b6e6393916cfacb2f238d55b2d215e0abca0f")
    public
        fun transformParameters(transformParameters: CfnMLTransform.TransformParametersProperty.Builder.() -> Unit)

    public fun workerType(workerType: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.glue.CfnMLTransformProps.Builder =
        software.amazon.awscdk.services.glue.CfnMLTransformProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun glueVersion(glueVersion: String) {
      cdkBuilder.glueVersion(glueVersion)
    }

    override fun inputRecordTables(inputRecordTables: IResolvable) {
      cdkBuilder.inputRecordTables(inputRecordTables.let(IResolvable::unwrap))
    }

    override fun inputRecordTables(inputRecordTables: CfnMLTransform.InputRecordTablesProperty) {
      cdkBuilder.inputRecordTables(inputRecordTables.let(CfnMLTransform.InputRecordTablesProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e8da151c4040cc639bd7c33e205b6ffe6a64840570c2d41166ca9462040c1fc0")
    override
        fun inputRecordTables(inputRecordTables: CfnMLTransform.InputRecordTablesProperty.Builder.() -> Unit):
        Unit = inputRecordTables(CfnMLTransform.InputRecordTablesProperty(inputRecordTables))

    override fun maxCapacity(maxCapacity: Number) {
      cdkBuilder.maxCapacity(maxCapacity)
    }

    override fun maxRetries(maxRetries: Number) {
      cdkBuilder.maxRetries(maxRetries)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun numberOfWorkers(numberOfWorkers: Number) {
      cdkBuilder.numberOfWorkers(numberOfWorkers)
    }

    override fun role(role: String) {
      cdkBuilder.role(role)
    }

    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    override fun timeout(timeout: Number) {
      cdkBuilder.timeout(timeout)
    }

    override fun transformEncryption(transformEncryption: IResolvable) {
      cdkBuilder.transformEncryption(transformEncryption.let(IResolvable::unwrap))
    }

    override
        fun transformEncryption(transformEncryption: CfnMLTransform.TransformEncryptionProperty) {
      cdkBuilder.transformEncryption(transformEncryption.let(CfnMLTransform.TransformEncryptionProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e5cb02a0469e41da2782260cbf1bac3a2f4f537b8dcb9b50de4cb9c520a51a1c")
    override
        fun transformEncryption(transformEncryption: CfnMLTransform.TransformEncryptionProperty.Builder.() -> Unit):
        Unit = transformEncryption(CfnMLTransform.TransformEncryptionProperty(transformEncryption))

    override fun transformParameters(transformParameters: IResolvable) {
      cdkBuilder.transformParameters(transformParameters.let(IResolvable::unwrap))
    }

    override
        fun transformParameters(transformParameters: CfnMLTransform.TransformParametersProperty) {
      cdkBuilder.transformParameters(transformParameters.let(CfnMLTransform.TransformParametersProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ee80a6d6c67fc3517c42dc75b63b6e6393916cfacb2f238d55b2d215e0abca0f")
    override
        fun transformParameters(transformParameters: CfnMLTransform.TransformParametersProperty.Builder.() -> Unit):
        Unit = transformParameters(CfnMLTransform.TransformParametersProperty(transformParameters))

    override fun workerType(workerType: String) {
      cdkBuilder.workerType(workerType)
    }

    public fun build(): software.amazon.awscdk.services.glue.CfnMLTransformProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.glue.CfnMLTransformProps,
  ) : CdkObject(cdkObject), CfnMLTransformProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun glueVersion(): String? = unwrap(this).getGlueVersion()

    override fun inputRecordTables(): Any = unwrap(this).getInputRecordTables()

    override fun maxCapacity(): Number? = unwrap(this).getMaxCapacity()

    override fun maxRetries(): Number? = unwrap(this).getMaxRetries()

    override fun name(): String? = unwrap(this).getName()

    override fun numberOfWorkers(): Number? = unwrap(this).getNumberOfWorkers()

    override fun role(): String = unwrap(this).getRole()

    override fun tags(): Any? = unwrap(this).getTags()

    override fun timeout(): Number? = unwrap(this).getTimeout()

    override fun transformEncryption(): Any? = unwrap(this).getTransformEncryption()

    override fun transformParameters(): Any = unwrap(this).getTransformParameters()

    override fun workerType(): String? = unwrap(this).getWorkerType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnMLTransformProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnMLTransformProps):
        CfnMLTransformProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnMLTransformProps):
        software.amazon.awscdk.services.glue.CfnMLTransformProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.glue.CfnMLTransformProps
  }
}
