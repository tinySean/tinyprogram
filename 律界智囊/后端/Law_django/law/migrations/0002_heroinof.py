# Generated by Django 2.1.5 on 2019-03-12 14:17

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('law', '0001_initial'),
    ]

    operations = [
        migrations.CreateModel(
            name='HeroInof',
            fields=[
                ('id', models.AutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('hname', models.CharField(max_length=20)),
                ('hgender', models.BooleanField(default=False)),
                ('hcomment', models.CharField(max_length=20)),
                ('hbook', models.ForeignKey(on_delete=True, to='law.BookInfo')),
            ],
        ),
    ]
