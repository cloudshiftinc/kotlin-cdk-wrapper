package io.cloudshiftdev.awscdk.services.secretsmanager

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnRotationSchedule internal constructor(
  private val cdkObject: software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun hostedRotationLambda(): Any? = unwrap(this).getHostedRotationLambda()

  public open fun hostedRotationLambda(`value`: IResolvable) {
    unwrap(this).setHostedRotationLambda(`value`.let(IResolvable::unwrap))
  }

  public open fun hostedRotationLambda(`value`: HostedRotationLambdaProperty) {
    unwrap(this).setHostedRotationLambda(`value`.let(HostedRotationLambdaProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e4f3b5001e8038bcf98afa77cf69b54a6f65534ec9115ffbf47edd7714ddbd79")
  public open fun hostedRotationLambda(`value`: HostedRotationLambdaProperty.Builder.() -> Unit):
      Unit = hostedRotationLambda(HostedRotationLambdaProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun rotateImmediatelyOnUpdate(): Any? = unwrap(this).getRotateImmediatelyOnUpdate()

  public open fun rotateImmediatelyOnUpdate(`value`: Boolean) {
    unwrap(this).setRotateImmediatelyOnUpdate(`value`)
  }

  public open fun rotateImmediatelyOnUpdate(`value`: IResolvable) {
    unwrap(this).setRotateImmediatelyOnUpdate(`value`.let(IResolvable::unwrap))
  }

  public open fun rotationLambdaArn(): String? = unwrap(this).getRotationLambdaArn()

  public open fun rotationLambdaArn(`value`: String) {
    unwrap(this).setRotationLambdaArn(`value`)
  }

  public open fun rotationRules(): Any? = unwrap(this).getRotationRules()

  public open fun rotationRules(`value`: IResolvable) {
    unwrap(this).setRotationRules(`value`.let(IResolvable::unwrap))
  }

  public open fun rotationRules(`value`: RotationRulesProperty) {
    unwrap(this).setRotationRules(`value`.let(RotationRulesProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a70141c33b81c9f1f3c80105794d18bba3b5e49d3227fa6395c01631f49521ec")
  public open fun rotationRules(`value`: RotationRulesProperty.Builder.() -> Unit): Unit =
      rotationRules(RotationRulesProperty(`value`))

  public open fun secretId(): String = unwrap(this).getSecretId()

  public open fun secretId(`value`: String) {
    unwrap(this).setSecretId(`value`)
  }

  public interface Builder {
    public fun hostedRotationLambda(hostedRotationLambda: IResolvable)

    public fun hostedRotationLambda(hostedRotationLambda: HostedRotationLambdaProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b06afb51ad3d8bac88363cde0f16d9b4bed6cf5832a421d68e17a00fd2a7087e")
    public
        fun hostedRotationLambda(hostedRotationLambda: HostedRotationLambdaProperty.Builder.() -> Unit)

    public fun rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate: Boolean)

    public fun rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate: IResolvable)

    public fun rotationLambdaArn(rotationLambdaArn: String)

    public fun rotationRules(rotationRules: IResolvable)

    public fun rotationRules(rotationRules: RotationRulesProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e0cec0ec9407190091306425f081b8377f2ea12f89e11fbcad0fc6ea1075493b")
    public fun rotationRules(rotationRules: RotationRulesProperty.Builder.() -> Unit)

    public fun secretId(secretId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule.Builder =
        software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule.Builder.create(scope, id)

    override fun hostedRotationLambda(hostedRotationLambda: IResolvable) {
      cdkBuilder.hostedRotationLambda(hostedRotationLambda.let(IResolvable::unwrap))
    }

    override fun hostedRotationLambda(hostedRotationLambda: HostedRotationLambdaProperty) {
      cdkBuilder.hostedRotationLambda(hostedRotationLambda.let(HostedRotationLambdaProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b06afb51ad3d8bac88363cde0f16d9b4bed6cf5832a421d68e17a00fd2a7087e")
    override
        fun hostedRotationLambda(hostedRotationLambda: HostedRotationLambdaProperty.Builder.() -> Unit):
        Unit = hostedRotationLambda(HostedRotationLambdaProperty(hostedRotationLambda))

    override fun rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate: Boolean) {
      cdkBuilder.rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate)
    }

    override fun rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate: IResolvable) {
      cdkBuilder.rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate.let(IResolvable::unwrap))
    }

    override fun rotationLambdaArn(rotationLambdaArn: String) {
      cdkBuilder.rotationLambdaArn(rotationLambdaArn)
    }

    override fun rotationRules(rotationRules: IResolvable) {
      cdkBuilder.rotationRules(rotationRules.let(IResolvable::unwrap))
    }

    override fun rotationRules(rotationRules: RotationRulesProperty) {
      cdkBuilder.rotationRules(rotationRules.let(RotationRulesProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e0cec0ec9407190091306425f081b8377f2ea12f89e11fbcad0fc6ea1075493b")
    override fun rotationRules(rotationRules: RotationRulesProperty.Builder.() -> Unit): Unit =
        rotationRules(RotationRulesProperty(rotationRules))

    override fun secretId(secretId: String) {
      cdkBuilder.secretId(secretId)
    }

    public fun build(): software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRotationSchedule {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRotationSchedule(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule):
        CfnRotationSchedule = CfnRotationSchedule(cdkObject)

    internal fun unwrap(wrapped: CfnRotationSchedule):
        software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule = wrapped.cdkObject
  }

  public interface RotationRulesProperty {
    public fun automaticallyAfterDays(): Number? = unwrap(this).getAutomaticallyAfterDays()

    public fun duration(): String? = unwrap(this).getDuration()

    public fun scheduleExpression(): String? = unwrap(this).getScheduleExpression()

    public interface Builder {
      public fun automaticallyAfterDays(automaticallyAfterDays: Number)

      public fun duration(duration: String)

      public fun scheduleExpression(scheduleExpression: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule.RotationRulesProperty.Builder
          =
          software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule.RotationRulesProperty.builder()

      override fun automaticallyAfterDays(automaticallyAfterDays: Number) {
        cdkBuilder.automaticallyAfterDays(automaticallyAfterDays)
      }

      override fun duration(duration: String) {
        cdkBuilder.duration(duration)
      }

      override fun scheduleExpression(scheduleExpression: String) {
        cdkBuilder.scheduleExpression(scheduleExpression)
      }

      public fun build():
          software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule.RotationRulesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule.RotationRulesProperty,
    ) : RotationRulesProperty {
      override fun automaticallyAfterDays(): Number? = unwrap(this).getAutomaticallyAfterDays()

      override fun duration(): String? = unwrap(this).getDuration()

      override fun scheduleExpression(): String? = unwrap(this).getScheduleExpression()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RotationRulesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule.RotationRulesProperty):
          RotationRulesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RotationRulesProperty):
          software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule.RotationRulesProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface HostedRotationLambdaProperty {
    public fun excludeCharacters(): String? = unwrap(this).getExcludeCharacters()

    public fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

    public fun masterSecretArn(): String? = unwrap(this).getMasterSecretArn()

    public fun masterSecretKmsKeyArn(): String? = unwrap(this).getMasterSecretKmsKeyArn()

    public fun rotationLambdaName(): String? = unwrap(this).getRotationLambdaName()

    public fun rotationType(): String

    public fun runtime(): String? = unwrap(this).getRuntime()

    public fun superuserSecretArn(): String? = unwrap(this).getSuperuserSecretArn()

    public fun superuserSecretKmsKeyArn(): String? = unwrap(this).getSuperuserSecretKmsKeyArn()

    public fun vpcSecurityGroupIds(): String? = unwrap(this).getVpcSecurityGroupIds()

    public fun vpcSubnetIds(): String? = unwrap(this).getVpcSubnetIds()

    public interface Builder {
      public fun excludeCharacters(excludeCharacters: String)

      public fun kmsKeyArn(kmsKeyArn: String)

      public fun masterSecretArn(masterSecretArn: String)

      public fun masterSecretKmsKeyArn(masterSecretKmsKeyArn: String)

      public fun rotationLambdaName(rotationLambdaName: String)

      public fun rotationType(rotationType: String)

      public fun runtime(runtime: String)

      public fun superuserSecretArn(superuserSecretArn: String)

      public fun superuserSecretKmsKeyArn(superuserSecretKmsKeyArn: String)

      public fun vpcSecurityGroupIds(vpcSecurityGroupIds: String)

      public fun vpcSubnetIds(vpcSubnetIds: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule.HostedRotationLambdaProperty.Builder
          =
          software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule.HostedRotationLambdaProperty.builder()

      override fun excludeCharacters(excludeCharacters: String) {
        cdkBuilder.excludeCharacters(excludeCharacters)
      }

      override fun kmsKeyArn(kmsKeyArn: String) {
        cdkBuilder.kmsKeyArn(kmsKeyArn)
      }

      override fun masterSecretArn(masterSecretArn: String) {
        cdkBuilder.masterSecretArn(masterSecretArn)
      }

      override fun masterSecretKmsKeyArn(masterSecretKmsKeyArn: String) {
        cdkBuilder.masterSecretKmsKeyArn(masterSecretKmsKeyArn)
      }

      override fun rotationLambdaName(rotationLambdaName: String) {
        cdkBuilder.rotationLambdaName(rotationLambdaName)
      }

      override fun rotationType(rotationType: String) {
        cdkBuilder.rotationType(rotationType)
      }

      override fun runtime(runtime: String) {
        cdkBuilder.runtime(runtime)
      }

      override fun superuserSecretArn(superuserSecretArn: String) {
        cdkBuilder.superuserSecretArn(superuserSecretArn)
      }

      override fun superuserSecretKmsKeyArn(superuserSecretKmsKeyArn: String) {
        cdkBuilder.superuserSecretKmsKeyArn(superuserSecretKmsKeyArn)
      }

      override fun vpcSecurityGroupIds(vpcSecurityGroupIds: String) {
        cdkBuilder.vpcSecurityGroupIds(vpcSecurityGroupIds)
      }

      override fun vpcSubnetIds(vpcSubnetIds: String) {
        cdkBuilder.vpcSubnetIds(vpcSubnetIds)
      }

      public fun build():
          software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule.HostedRotationLambdaProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule.HostedRotationLambdaProperty,
    ) : HostedRotationLambdaProperty {
      override fun excludeCharacters(): String? = unwrap(this).getExcludeCharacters()

      override fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

      override fun masterSecretArn(): String? = unwrap(this).getMasterSecretArn()

      override fun masterSecretKmsKeyArn(): String? = unwrap(this).getMasterSecretKmsKeyArn()

      override fun rotationLambdaName(): String? = unwrap(this).getRotationLambdaName()

      override fun rotationType(): String = unwrap(this).getRotationType()

      override fun runtime(): String? = unwrap(this).getRuntime()

      override fun superuserSecretArn(): String? = unwrap(this).getSuperuserSecretArn()

      override fun superuserSecretKmsKeyArn(): String? = unwrap(this).getSuperuserSecretKmsKeyArn()

      override fun vpcSecurityGroupIds(): String? = unwrap(this).getVpcSecurityGroupIds()

      override fun vpcSubnetIds(): String? = unwrap(this).getVpcSubnetIds()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HostedRotationLambdaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule.HostedRotationLambdaProperty):
          HostedRotationLambdaProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HostedRotationLambdaProperty):
          software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule.HostedRotationLambdaProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
