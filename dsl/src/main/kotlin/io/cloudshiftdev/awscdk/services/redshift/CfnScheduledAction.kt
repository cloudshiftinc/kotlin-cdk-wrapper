package io.cloudshiftdev.awscdk.services.redshift

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
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnScheduledAction internal constructor(
  private val cdkObject: software.amazon.awscdk.services.redshift.CfnScheduledAction,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrNextInvocations(): List<String> = unwrap(this).getAttrNextInvocations() ?:
      emptyList()

  public open fun attrState(): String = unwrap(this).getAttrState()

  public open fun enable(): Any? = unwrap(this).getEnable()

  public open fun enable(`value`: Boolean) {
    unwrap(this).setEnable(`value`)
  }

  public open fun enable(`value`: IResolvable) {
    unwrap(this).setEnable(`value`.let(IResolvable::unwrap))
  }

  public open fun endTime(): String? = unwrap(this).getEndTime()

  public open fun endTime(`value`: String) {
    unwrap(this).setEndTime(`value`)
  }

  public open fun iamRole(): String? = unwrap(this).getIamRole()

  public open fun iamRole(`value`: String) {
    unwrap(this).setIamRole(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun schedule(): String? = unwrap(this).getSchedule()

  public open fun schedule(`value`: String) {
    unwrap(this).setSchedule(`value`)
  }

  public open fun scheduledActionDescription(): String? =
      unwrap(this).getScheduledActionDescription()

  public open fun scheduledActionDescription(`value`: String) {
    unwrap(this).setScheduledActionDescription(`value`)
  }

  public open fun scheduledActionName(): String = unwrap(this).getScheduledActionName()

  public open fun scheduledActionName(`value`: String) {
    unwrap(this).setScheduledActionName(`value`)
  }

  public open fun startTime(): String? = unwrap(this).getStartTime()

  public open fun startTime(`value`: String) {
    unwrap(this).setStartTime(`value`)
  }

  public open fun targetAction(): Any? = unwrap(this).getTargetAction()

  public open fun targetAction(`value`: IResolvable) {
    unwrap(this).setTargetAction(`value`.let(IResolvable::unwrap))
  }

  public open fun targetAction(`value`: ScheduledActionTypeProperty) {
    unwrap(this).setTargetAction(`value`.let(ScheduledActionTypeProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e4b776fff06cfc70e9dc28510b2c0860fe6a17c4d592e3160522dec0f65666da")
  public open fun targetAction(`value`: ScheduledActionTypeProperty.Builder.() -> Unit): Unit =
      targetAction(ScheduledActionTypeProperty(`value`))

  public interface Builder {
    public fun enable(enable: Boolean)

    public fun enable(enable: IResolvable)

    public fun endTime(endTime: String)

    public fun iamRole(iamRole: String)

    public fun schedule(schedule: String)

    public fun scheduledActionDescription(scheduledActionDescription: String)

    public fun scheduledActionName(scheduledActionName: String)

    public fun startTime(startTime: String)

    public fun targetAction(targetAction: IResolvable)

    public fun targetAction(targetAction: ScheduledActionTypeProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d14944716e8349afb884b0656bf96de37477ce11afde21172787d26fbb9224eb")
    public fun targetAction(targetAction: ScheduledActionTypeProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.redshift.CfnScheduledAction.Builder =
        software.amazon.awscdk.services.redshift.CfnScheduledAction.Builder.create(scope, id)

    override fun enable(enable: Boolean) {
      cdkBuilder.enable(enable)
    }

    override fun enable(enable: IResolvable) {
      cdkBuilder.enable(enable.let(IResolvable::unwrap))
    }

    override fun endTime(endTime: String) {
      cdkBuilder.endTime(endTime)
    }

    override fun iamRole(iamRole: String) {
      cdkBuilder.iamRole(iamRole)
    }

    override fun schedule(schedule: String) {
      cdkBuilder.schedule(schedule)
    }

    override fun scheduledActionDescription(scheduledActionDescription: String) {
      cdkBuilder.scheduledActionDescription(scheduledActionDescription)
    }

    override fun scheduledActionName(scheduledActionName: String) {
      cdkBuilder.scheduledActionName(scheduledActionName)
    }

    override fun startTime(startTime: String) {
      cdkBuilder.startTime(startTime)
    }

    override fun targetAction(targetAction: IResolvable) {
      cdkBuilder.targetAction(targetAction.let(IResolvable::unwrap))
    }

    override fun targetAction(targetAction: ScheduledActionTypeProperty) {
      cdkBuilder.targetAction(targetAction.let(ScheduledActionTypeProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d14944716e8349afb884b0656bf96de37477ce11afde21172787d26fbb9224eb")
    override fun targetAction(targetAction: ScheduledActionTypeProperty.Builder.() -> Unit): Unit =
        targetAction(ScheduledActionTypeProperty(targetAction))

    public fun build(): software.amazon.awscdk.services.redshift.CfnScheduledAction =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnScheduledAction {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnScheduledAction(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.redshift.CfnScheduledAction):
        CfnScheduledAction = CfnScheduledAction(cdkObject)

    internal fun unwrap(wrapped: CfnScheduledAction):
        software.amazon.awscdk.services.redshift.CfnScheduledAction = wrapped.cdkObject
  }

  public interface ResizeClusterMessageProperty {
    public fun classic(): Any? = unwrap(this).getClassic()

    public fun clusterIdentifier(): String

    public fun clusterType(): String? = unwrap(this).getClusterType()

    public fun nodeType(): String? = unwrap(this).getNodeType()

    public fun numberOfNodes(): Number? = unwrap(this).getNumberOfNodes()

    public interface Builder {
      public fun classic(classic: Boolean)

      public fun classic(classic: IResolvable)

      public fun clusterIdentifier(clusterIdentifier: String)

      public fun clusterType(clusterType: String)

      public fun nodeType(nodeType: String)

      public fun numberOfNodes(numberOfNodes: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.redshift.CfnScheduledAction.ResizeClusterMessageProperty.Builder
          =
          software.amazon.awscdk.services.redshift.CfnScheduledAction.ResizeClusterMessageProperty.builder()

      override fun classic(classic: Boolean) {
        cdkBuilder.classic(classic)
      }

      override fun classic(classic: IResolvable) {
        cdkBuilder.classic(classic.let(IResolvable::unwrap))
      }

      override fun clusterIdentifier(clusterIdentifier: String) {
        cdkBuilder.clusterIdentifier(clusterIdentifier)
      }

      override fun clusterType(clusterType: String) {
        cdkBuilder.clusterType(clusterType)
      }

      override fun nodeType(nodeType: String) {
        cdkBuilder.nodeType(nodeType)
      }

      override fun numberOfNodes(numberOfNodes: Number) {
        cdkBuilder.numberOfNodes(numberOfNodes)
      }

      public fun build():
          software.amazon.awscdk.services.redshift.CfnScheduledAction.ResizeClusterMessageProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.redshift.CfnScheduledAction.ResizeClusterMessageProperty,
    ) : ResizeClusterMessageProperty {
      override fun classic(): Any? = unwrap(this).getClassic()

      override fun clusterIdentifier(): String = unwrap(this).getClusterIdentifier()

      override fun clusterType(): String? = unwrap(this).getClusterType()

      override fun nodeType(): String? = unwrap(this).getNodeType()

      override fun numberOfNodes(): Number? = unwrap(this).getNumberOfNodes()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ResizeClusterMessageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.redshift.CfnScheduledAction.ResizeClusterMessageProperty):
          ResizeClusterMessageProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResizeClusterMessageProperty):
          software.amazon.awscdk.services.redshift.CfnScheduledAction.ResizeClusterMessageProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ResumeClusterMessageProperty {
    public fun clusterIdentifier(): String

    public interface Builder {
      public fun clusterIdentifier(clusterIdentifier: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.redshift.CfnScheduledAction.ResumeClusterMessageProperty.Builder
          =
          software.amazon.awscdk.services.redshift.CfnScheduledAction.ResumeClusterMessageProperty.builder()

      override fun clusterIdentifier(clusterIdentifier: String) {
        cdkBuilder.clusterIdentifier(clusterIdentifier)
      }

      public fun build():
          software.amazon.awscdk.services.redshift.CfnScheduledAction.ResumeClusterMessageProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.redshift.CfnScheduledAction.ResumeClusterMessageProperty,
    ) : ResumeClusterMessageProperty {
      override fun clusterIdentifier(): String = unwrap(this).getClusterIdentifier()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ResumeClusterMessageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.redshift.CfnScheduledAction.ResumeClusterMessageProperty):
          ResumeClusterMessageProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResumeClusterMessageProperty):
          software.amazon.awscdk.services.redshift.CfnScheduledAction.ResumeClusterMessageProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface PauseClusterMessageProperty {
    public fun clusterIdentifier(): String

    public interface Builder {
      public fun clusterIdentifier(clusterIdentifier: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.redshift.CfnScheduledAction.PauseClusterMessageProperty.Builder
          =
          software.amazon.awscdk.services.redshift.CfnScheduledAction.PauseClusterMessageProperty.builder()

      override fun clusterIdentifier(clusterIdentifier: String) {
        cdkBuilder.clusterIdentifier(clusterIdentifier)
      }

      public fun build():
          software.amazon.awscdk.services.redshift.CfnScheduledAction.PauseClusterMessageProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.redshift.CfnScheduledAction.PauseClusterMessageProperty,
    ) : PauseClusterMessageProperty {
      override fun clusterIdentifier(): String = unwrap(this).getClusterIdentifier()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PauseClusterMessageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.redshift.CfnScheduledAction.PauseClusterMessageProperty):
          PauseClusterMessageProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PauseClusterMessageProperty):
          software.amazon.awscdk.services.redshift.CfnScheduledAction.PauseClusterMessageProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ScheduledActionTypeProperty {
    public fun pauseCluster(): Any? = unwrap(this).getPauseCluster()

    public fun resizeCluster(): Any? = unwrap(this).getResizeCluster()

    public fun resumeCluster(): Any? = unwrap(this).getResumeCluster()

    public interface Builder {
      public fun pauseCluster(pauseCluster: IResolvable)

      public fun pauseCluster(pauseCluster: PauseClusterMessageProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a24da4bcf80749aa50cbefd201500769afcab07d995759c89ae4b58185cd8ff4")
      public fun pauseCluster(pauseCluster: PauseClusterMessageProperty.Builder.() -> Unit)

      public fun resizeCluster(resizeCluster: IResolvable)

      public fun resizeCluster(resizeCluster: ResizeClusterMessageProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dc0c6375f9e1956454d5514ce08573f2beb7656c87933e47644f071f71821d30")
      public fun resizeCluster(resizeCluster: ResizeClusterMessageProperty.Builder.() -> Unit)

      public fun resumeCluster(resumeCluster: IResolvable)

      public fun resumeCluster(resumeCluster: ResumeClusterMessageProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cb060bab55e9fef415647c52936d5aa164157292c6e5658c8be5d9de35546c1b")
      public fun resumeCluster(resumeCluster: ResumeClusterMessageProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.redshift.CfnScheduledAction.ScheduledActionTypeProperty.Builder
          =
          software.amazon.awscdk.services.redshift.CfnScheduledAction.ScheduledActionTypeProperty.builder()

      override fun pauseCluster(pauseCluster: IResolvable) {
        cdkBuilder.pauseCluster(pauseCluster.let(IResolvable::unwrap))
      }

      override fun pauseCluster(pauseCluster: PauseClusterMessageProperty) {
        cdkBuilder.pauseCluster(pauseCluster.let(PauseClusterMessageProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a24da4bcf80749aa50cbefd201500769afcab07d995759c89ae4b58185cd8ff4")
      override fun pauseCluster(pauseCluster: PauseClusterMessageProperty.Builder.() -> Unit): Unit
          = pauseCluster(PauseClusterMessageProperty(pauseCluster))

      override fun resizeCluster(resizeCluster: IResolvable) {
        cdkBuilder.resizeCluster(resizeCluster.let(IResolvable::unwrap))
      }

      override fun resizeCluster(resizeCluster: ResizeClusterMessageProperty) {
        cdkBuilder.resizeCluster(resizeCluster.let(ResizeClusterMessageProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dc0c6375f9e1956454d5514ce08573f2beb7656c87933e47644f071f71821d30")
      override fun resizeCluster(resizeCluster: ResizeClusterMessageProperty.Builder.() -> Unit):
          Unit = resizeCluster(ResizeClusterMessageProperty(resizeCluster))

      override fun resumeCluster(resumeCluster: IResolvable) {
        cdkBuilder.resumeCluster(resumeCluster.let(IResolvable::unwrap))
      }

      override fun resumeCluster(resumeCluster: ResumeClusterMessageProperty) {
        cdkBuilder.resumeCluster(resumeCluster.let(ResumeClusterMessageProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cb060bab55e9fef415647c52936d5aa164157292c6e5658c8be5d9de35546c1b")
      override fun resumeCluster(resumeCluster: ResumeClusterMessageProperty.Builder.() -> Unit):
          Unit = resumeCluster(ResumeClusterMessageProperty(resumeCluster))

      public fun build():
          software.amazon.awscdk.services.redshift.CfnScheduledAction.ScheduledActionTypeProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.redshift.CfnScheduledAction.ScheduledActionTypeProperty,
    ) : ScheduledActionTypeProperty {
      override fun pauseCluster(): Any? = unwrap(this).getPauseCluster()

      override fun resizeCluster(): Any? = unwrap(this).getResizeCluster()

      override fun resumeCluster(): Any? = unwrap(this).getResumeCluster()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ScheduledActionTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.redshift.CfnScheduledAction.ScheduledActionTypeProperty):
          ScheduledActionTypeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScheduledActionTypeProperty):
          software.amazon.awscdk.services.redshift.CfnScheduledAction.ScheduledActionTypeProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
