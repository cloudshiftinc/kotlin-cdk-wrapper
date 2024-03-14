package io.cloudshiftdev.awscdk.services.iotsitewise

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnAccessPolicy internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy,
) : CfnResource(cdkObject), IInspectable {
  public open fun accessPolicyIdentity(): Any = unwrap(this).getAccessPolicyIdentity()

  public open fun accessPolicyIdentity(`value`: IResolvable) {
    unwrap(this).setAccessPolicyIdentity(`value`.let(IResolvable::unwrap))
  }

  public open fun accessPolicyIdentity(`value`: AccessPolicyIdentityProperty) {
    unwrap(this).setAccessPolicyIdentity(`value`.let(AccessPolicyIdentityProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7ef47bfd649e94f7cc8f07888d4ce74e1afe7cae0de3ccdd8fc04a008336f95a")
  public open fun accessPolicyIdentity(`value`: AccessPolicyIdentityProperty.Builder.() -> Unit):
      Unit = accessPolicyIdentity(AccessPolicyIdentityProperty(`value`))

  public open fun accessPolicyPermission(): String = unwrap(this).getAccessPolicyPermission()

  public open fun accessPolicyPermission(`value`: String) {
    unwrap(this).setAccessPolicyPermission(`value`)
  }

  public open fun accessPolicyResource(): Any = unwrap(this).getAccessPolicyResource()

  public open fun accessPolicyResource(`value`: IResolvable) {
    unwrap(this).setAccessPolicyResource(`value`.let(IResolvable::unwrap))
  }

  public open fun accessPolicyResource(`value`: AccessPolicyResourceProperty) {
    unwrap(this).setAccessPolicyResource(`value`.let(AccessPolicyResourceProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("91e16c3090085a219492b7184b483cd66f04de1aea4329d0d06be134aa84523b")
  public open fun accessPolicyResource(`value`: AccessPolicyResourceProperty.Builder.() -> Unit):
      Unit = accessPolicyResource(AccessPolicyResourceProperty(`value`))

  public open fun attrAccessPolicyArn(): String = unwrap(this).getAttrAccessPolicyArn()

  public open fun attrAccessPolicyId(): String = unwrap(this).getAttrAccessPolicyId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public interface Builder {
    public fun accessPolicyIdentity(accessPolicyIdentity: IResolvable)

    public fun accessPolicyIdentity(accessPolicyIdentity: AccessPolicyIdentityProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ba0b6288f8d7a538847ec33b15c817454bd77798ebea103e3a02993db166e141")
    public
        fun accessPolicyIdentity(accessPolicyIdentity: AccessPolicyIdentityProperty.Builder.() -> Unit)

    public fun accessPolicyPermission(accessPolicyPermission: String)

    public fun accessPolicyResource(accessPolicyResource: IResolvable)

    public fun accessPolicyResource(accessPolicyResource: AccessPolicyResourceProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5cea6ccf0d9b11d8e3c96d08f69a5f41cfc124716f241c04562834fed75f4f2d")
    public
        fun accessPolicyResource(accessPolicyResource: AccessPolicyResourceProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.Builder =
        software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.Builder.create(scope, id)

    override fun accessPolicyIdentity(accessPolicyIdentity: IResolvable) {
      cdkBuilder.accessPolicyIdentity(accessPolicyIdentity.let(IResolvable::unwrap))
    }

    override fun accessPolicyIdentity(accessPolicyIdentity: AccessPolicyIdentityProperty) {
      cdkBuilder.accessPolicyIdentity(accessPolicyIdentity.let(AccessPolicyIdentityProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ba0b6288f8d7a538847ec33b15c817454bd77798ebea103e3a02993db166e141")
    override
        fun accessPolicyIdentity(accessPolicyIdentity: AccessPolicyIdentityProperty.Builder.() -> Unit):
        Unit = accessPolicyIdentity(AccessPolicyIdentityProperty(accessPolicyIdentity))

    override fun accessPolicyPermission(accessPolicyPermission: String) {
      cdkBuilder.accessPolicyPermission(accessPolicyPermission)
    }

    override fun accessPolicyResource(accessPolicyResource: IResolvable) {
      cdkBuilder.accessPolicyResource(accessPolicyResource.let(IResolvable::unwrap))
    }

    override fun accessPolicyResource(accessPolicyResource: AccessPolicyResourceProperty) {
      cdkBuilder.accessPolicyResource(accessPolicyResource.let(AccessPolicyResourceProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5cea6ccf0d9b11d8e3c96d08f69a5f41cfc124716f241c04562834fed75f4f2d")
    override
        fun accessPolicyResource(accessPolicyResource: AccessPolicyResourceProperty.Builder.() -> Unit):
        Unit = accessPolicyResource(AccessPolicyResourceProperty(accessPolicyResource))

    public fun build(): software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAccessPolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAccessPolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy):
        CfnAccessPolicy = CfnAccessPolicy(cdkObject)

    internal fun unwrap(wrapped: CfnAccessPolicy):
        software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy = wrapped.cdkObject
  }

  public interface IamRoleProperty {
    public fun arn(): String? = unwrap(this).getArn()

    public interface Builder {
      public fun arn(arn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.IamRoleProperty.Builder =
          software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.IamRoleProperty.builder()

      override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      public fun build():
          software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.IamRoleProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.IamRoleProperty,
    ) : IamRoleProperty {
      override fun arn(): String? = unwrap(this).getArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): IamRoleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.IamRoleProperty):
          IamRoleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IamRoleProperty):
          software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.IamRoleProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface IamUserProperty {
    public fun arn(): String? = unwrap(this).getArn()

    public interface Builder {
      public fun arn(arn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.IamUserProperty.Builder =
          software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.IamUserProperty.builder()

      override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      public fun build():
          software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.IamUserProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.IamUserProperty,
    ) : IamUserProperty {
      override fun arn(): String? = unwrap(this).getArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): IamUserProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.IamUserProperty):
          IamUserProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IamUserProperty):
          software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.IamUserProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface AccessPolicyResourceProperty {
    public fun portal(): Any? = unwrap(this).getPortal()

    public fun project(): Any? = unwrap(this).getProject()

    public interface Builder {
      public fun portal(portal: IResolvable)

      public fun portal(portal: PortalProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e04ce2ff0f5f1fcb91a8a5320cbf19c81ae4c2319745f777cb2cf3acda573f5a")
      public fun portal(portal: PortalProperty.Builder.() -> Unit)

      public fun project(project: IResolvable)

      public fun project(project: ProjectProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f3815225218a2895b45b4c213a61eaa5f7af0abcab4676b89a02eb8016b256d5")
      public fun project(project: ProjectProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.AccessPolicyResourceProperty.Builder
          =
          software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.AccessPolicyResourceProperty.builder()

      override fun portal(portal: IResolvable) {
        cdkBuilder.portal(portal.let(IResolvable::unwrap))
      }

      override fun portal(portal: PortalProperty) {
        cdkBuilder.portal(portal.let(PortalProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e04ce2ff0f5f1fcb91a8a5320cbf19c81ae4c2319745f777cb2cf3acda573f5a")
      override fun portal(portal: PortalProperty.Builder.() -> Unit): Unit =
          portal(PortalProperty(portal))

      override fun project(project: IResolvable) {
        cdkBuilder.project(project.let(IResolvable::unwrap))
      }

      override fun project(project: ProjectProperty) {
        cdkBuilder.project(project.let(ProjectProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f3815225218a2895b45b4c213a61eaa5f7af0abcab4676b89a02eb8016b256d5")
      override fun project(project: ProjectProperty.Builder.() -> Unit): Unit =
          project(ProjectProperty(project))

      public fun build():
          software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.AccessPolicyResourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.AccessPolicyResourceProperty,
    ) : AccessPolicyResourceProperty {
      override fun portal(): Any? = unwrap(this).getPortal()

      override fun project(): Any? = unwrap(this).getProject()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AccessPolicyResourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.AccessPolicyResourceProperty):
          AccessPolicyResourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AccessPolicyResourceProperty):
          software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.AccessPolicyResourceProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface UserProperty {
    public fun id(): String? = unwrap(this).getId()

    public interface Builder {
      public fun id(id: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.UserProperty.Builder =
          software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.UserProperty.builder()

      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      public fun build(): software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.UserProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.UserProperty,
    ) : UserProperty {
      override fun id(): String? = unwrap(this).getId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): UserProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.UserProperty):
          UserProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: UserProperty):
          software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.UserProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface AccessPolicyIdentityProperty {
    public fun iamRole(): Any? = unwrap(this).getIamRole()

    public fun iamUser(): Any? = unwrap(this).getIamUser()

    public fun user(): Any? = unwrap(this).getUser()

    public interface Builder {
      public fun iamRole(iamRole: IResolvable)

      public fun iamRole(iamRole: IamRoleProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("328197fd2e04f80290b7704d49b6bacf39ab3ea71c7e565e48b746b7d171b412")
      public fun iamRole(iamRole: IamRoleProperty.Builder.() -> Unit)

      public fun iamUser(iamUser: IResolvable)

      public fun iamUser(iamUser: IamUserProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("116b3c3ca5fae3d54b7546b5361d08260e9d2694cfbc683de9db9411a01a9807")
      public fun iamUser(iamUser: IamUserProperty.Builder.() -> Unit)

      public fun user(user: IResolvable)

      public fun user(user: UserProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("746495a1927bed50c37c06e856341df13539bbd48ade5a8d68215886f6a3f9ec")
      public fun user(user: UserProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.AccessPolicyIdentityProperty.Builder
          =
          software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.AccessPolicyIdentityProperty.builder()

      override fun iamRole(iamRole: IResolvable) {
        cdkBuilder.iamRole(iamRole.let(IResolvable::unwrap))
      }

      override fun iamRole(iamRole: IamRoleProperty) {
        cdkBuilder.iamRole(iamRole.let(IamRoleProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("328197fd2e04f80290b7704d49b6bacf39ab3ea71c7e565e48b746b7d171b412")
      override fun iamRole(iamRole: IamRoleProperty.Builder.() -> Unit): Unit =
          iamRole(IamRoleProperty(iamRole))

      override fun iamUser(iamUser: IResolvable) {
        cdkBuilder.iamUser(iamUser.let(IResolvable::unwrap))
      }

      override fun iamUser(iamUser: IamUserProperty) {
        cdkBuilder.iamUser(iamUser.let(IamUserProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("116b3c3ca5fae3d54b7546b5361d08260e9d2694cfbc683de9db9411a01a9807")
      override fun iamUser(iamUser: IamUserProperty.Builder.() -> Unit): Unit =
          iamUser(IamUserProperty(iamUser))

      override fun user(user: IResolvable) {
        cdkBuilder.user(user.let(IResolvable::unwrap))
      }

      override fun user(user: UserProperty) {
        cdkBuilder.user(user.let(UserProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("746495a1927bed50c37c06e856341df13539bbd48ade5a8d68215886f6a3f9ec")
      override fun user(user: UserProperty.Builder.() -> Unit): Unit = user(UserProperty(user))

      public fun build():
          software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.AccessPolicyIdentityProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.AccessPolicyIdentityProperty,
    ) : AccessPolicyIdentityProperty {
      override fun iamRole(): Any? = unwrap(this).getIamRole()

      override fun iamUser(): Any? = unwrap(this).getIamUser()

      override fun user(): Any? = unwrap(this).getUser()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AccessPolicyIdentityProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.AccessPolicyIdentityProperty):
          AccessPolicyIdentityProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AccessPolicyIdentityProperty):
          software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.AccessPolicyIdentityProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface PortalProperty {
    public fun id(): String? = unwrap(this).getId()

    public interface Builder {
      public fun id(id: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.PortalProperty.Builder =
          software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.PortalProperty.builder()

      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      public fun build(): software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.PortalProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.PortalProperty,
    ) : PortalProperty {
      override fun id(): String? = unwrap(this).getId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PortalProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.PortalProperty):
          PortalProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PortalProperty):
          software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.PortalProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ProjectProperty {
    public fun id(): String? = unwrap(this).getId()

    public interface Builder {
      public fun id(id: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.ProjectProperty.Builder =
          software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.ProjectProperty.builder()

      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      public fun build():
          software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.ProjectProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.ProjectProperty,
    ) : ProjectProperty {
      override fun id(): String? = unwrap(this).getId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ProjectProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.ProjectProperty):
          ProjectProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProjectProperty):
          software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.ProjectProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
